package com.demo.controller;

import com.demo.domain.Canteen;
import com.demo.domain.Food;
import com.demo.service.CanteenService;
import com.demo.service.FoodService;
import com.demo.service.OrderFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class OrderFoodController {

    @Autowired
    private CanteenService canteenService;
    @Autowired
    private FoodService foodService;
    @Autowired
    private OrderFoodService orderFoodService;

    @RequestMapping("/canteenInfo")
    public String canteenList(HttpServletRequest req){

        List<Canteen> canteenList = canteenService.selectAllCanteen();
        for(Canteen canteen:canteenList){
            System.out.println(canteen.toString());
        }

        req.setAttribute("canteenList",canteenList);

        return "canteenInfo";
    }

    @RequestMapping("/orderFood")
    public String foodList(HttpServletRequest req){
        List<Food> foodList = foodService.selectAllFood();
        req.setAttribute("foodList",foodList);
        for(Food food:foodList){
            System.out.println(food.toString());
        }

        return "orderList";
    }

    @RequestMapping("/selectFoodByName")
    public String selectFoodByName(HttpServletRequest req){
        String foodName = req.getParameter("foodName");
        List<Food> foodList = orderFoodService.selectFoodByName(foodName);
        req.setAttribute("foodList",foodList);
        System.out.println("按名称查找:"+ foodName);
        for(Food food:foodList){
            System.out.println(food.toString());
        }

        return "orderList";
    }

    @RequestMapping("/selectFoodByCanteen")
    public String selectFoodByCanteen(HttpServletRequest req){
        String foodCanteen = req.getParameter("foodCanteen");
        List<Food> foodList = orderFoodService.selectFoodByCanteen(foodCanteen);
        req.setAttribute("foodList",foodList);
        System.out.println("按食堂查找："+foodCanteen);
        for(Food food:foodList){
            System.out.println(food.toString());
        }

        return "orderList";
    }

    @RequestMapping("/selectAllFood")
    public String selectAllFood(HttpServletRequest req){
        List<Food> foodList = foodService.selectAllFood();
        req.setAttribute("foodList",foodList);
        System.out.println("显示全部");
        for(Food food:foodList){
            System.out.println(food.toString());
        }

        return "orderList";
    }

    @RequestMapping("/selectFood")
    public String selectFood(HttpServletRequest req){
        int id = Integer.parseInt(req.getParameter("id"));
        Food food = foodService.selectFoodById(id);

        HttpSession session = req.getSession();
        int count = (int) session.getAttribute("count");
        int paySum = (int) session.getAttribute("paySum");
        System.out.println("count:"+count+"paySum:"+paySum);
        if(count == 0){
            List<Food> orderedList = new ArrayList<Food>();
            orderedList.add(food);
            session.setAttribute("orderedList",orderedList);
            count++;
            session.setAttribute("count",count);
            paySum = Integer.parseInt(food.getPay());
            session.setAttribute("paySum",paySum);
            return "payFood";
        }else{
            paySum=0;
            List<Food> orderedList = (List<Food>) session.getAttribute("orderedList");
            System.out.println("已选购的菜单:");
            if(orderedList != null){
                for(Food f:orderedList){
                    System.out.println(f.toString());
                }
            }

            orderedList.add(food);
            for(Food f:orderedList){
                paySum += Integer.parseInt(f.getPay());
            }
            session.setAttribute("paySum",paySum);
            session.setAttribute("orderedList",orderedList);
            return "payFood";
        }

    }

    @RequestMapping("/payFood")
    public String payFood(HttpServletRequest req){


        return "payFood";
    }
}
