package com.demo.controller;

import com.demo.domain.User;
import com.demo.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/manage")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @RequestMapping("/userList")
    public String userList(HttpServletRequest request){
        List<User> userList = managerService.selectAllUser();
        request.setAttribute("userList",userList);
        for (User u:userList){
            System.out.println(u.toString());
        }

        return "userList";
    }

    @RequestMapping("/updateUser")
    public String updateUser(HttpServletRequest req,HttpServletResponse resp){
        int id = Integer.parseInt(req.getParameter("id"));
        String method = req.getParameter("method");
        System.out.println("待处理userid:"+id + method);

        if(method.equals("delete")){
            managerService.DeleteUser(id);
            return "userList";
        }
        if(method.equals("update")){
            User user = managerService.selectUserById(id);
            req.setAttribute("user",user);
            req.setAttribute("id",id);
            System.out.println(id + " +" + user);
            return "updateUser";
        }
    }
}
