package com.demo.controller;

import com.demo.domain.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        System.out.println("controller层：查询所有账户。。。");

        List<User> list = userService.findAll();
        for (User u:list){
            System.out.println(u.toString());
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");

        return mv;
    }

    @RequestMapping("/save")
    public String save(User user){
        System.out.println("controller层：保存账户。。。");

        userService.save(user);

        return "success";
    }

    @RequestMapping("/register")
    public String register(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");

        if(password.equals(repassword)){
            System.out.println("注册成功");
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            userService.insertUsernameAndPassword(user);

            return "login";
        }else{
            System.out.println("注册失败");
            return "register";
        }
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("login:"+username+"+"+password);

        if(userService.selectUsernameAndPassword(username,password) == null){
            request.setAttribute("fail","登录");
            return "fail";
        }else{
            return "homePage";
        }
    }
}

