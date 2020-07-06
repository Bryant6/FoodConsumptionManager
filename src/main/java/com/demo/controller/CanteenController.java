package com.demo.controller;

import com.demo.domain.Canteen;
import com.demo.domain.Food;
import com.demo.service.CanteenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/canteen")
public class CanteenController {

    @Autowired
    private CanteenService canteenService;

    @RequestMapping("/canteenList")
    public String canteenList(HttpServletRequest req){

        List<Canteen> canteenList = canteenService.selectAllCanteen();
        for(Canteen canteen:canteenList){
            System.out.println(canteen.toString());
        }

        req.setAttribute("canteenList",canteenList);

        return "canteenList";
    }

    @RequestMapping("/findFood")
    public String findFood(HttpServletRequest req){

        String canteen = req.getParameter("canteen");

        List<Food> foodList = canteenService.findFood(canteen);
        for (Food food:foodList){
            System.out.println(food.toString());
        }
        req.setAttribute("foodList",foodList);
        req.setAttribute("canteen",canteen);;

        return "itemFoodList";
    }

    @RequestMapping("findCanteen")
    public String findCanteen(HttpServletRequest req){
        int id = Integer.parseInt(req.getParameter("id"));

        Canteen canteen = canteenService.findCanteen(id);
        req.setAttribute("canteen",canteen);
        req.setAttribute("id",id);

        return "updateCanteen";
    }

    @RequestMapping("updateCanteen")
    public String updateCanteen(HttpServletRequest req){
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String workerNumber = req.getParameter("workerNumber");
        String info = req.getParameter("info");
        String openTime = req.getParameter("openTime");

        canteenService.updateCanteen(name,workerNumber,info,openTime,id);

        return "homePage";
    }
}
