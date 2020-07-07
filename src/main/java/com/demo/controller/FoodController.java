package com.demo.controller;

import com.demo.domain.Food;
import com.demo.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @RequestMapping("/foodList")
    public String foodList(HttpServletRequest req){
        List<Food> foodList = foodService.selectAllFood();
        req.setAttribute("foodList",foodList);
        for(Food food:foodList){
            System.out.println(food.toString());
        }

        return "foodList";
    }

    @RequestMapping("/deleteFood")
    public String deleteFood(HttpServletRequest req){
        int id = Integer.parseInt(req.getParameter("id"));
        foodService.deleteFood(id);

        return "homePage";
    }

    @RequestMapping("/selectFoodById")
    public String selectFoodById(HttpServletRequest req){
        int id = Integer.parseInt(req.getParameter("id"));
        Food food = foodService.selectFoodById(id);
        req.setAttribute("food",food);
        req.setAttribute("id",id);
        System.out.println(food.toString());

        return "updateFood";
    }

    @RequestMapping("/updateFood")
    public String updateFood(HttpServletRequest req){
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String pay = req.getParameter("pay");
        String canteen = req.getParameter("canteen");

        System.out.println("修改food:"+id+name+type+pay+canteen);

        foodService.updateFood(name,type,pay,canteen,id);

        return "homePage";
    }

    @RequestMapping("/addFood")
    public String addFood(HttpServletRequest req){
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String pay = req.getParameter("pay");
        String canteen = req.getParameter("canteen");

        System.out.println("添加food:"+name+type+pay+canteen);

        foodService.addFood(name,type,pay,canteen);

        return "homePage";
    }
}
