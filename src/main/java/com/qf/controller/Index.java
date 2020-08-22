package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
//@CrossOrigin
//// http://localhost:8082/
public class Index {
    @Autowired
    private UserService userService;

//    @RequestMapping("/")
//    public String hello(){
//
//    }

    @RequestMapping("/")
    public String login(){
//        System.out.println("yes");
        return "/login";
    }
    @RequestMapping("/refuse")
    @ResponseBody
    public String refuse(){
//        System.out.println("yes");
        return "refuse";
    }
    @RequestMapping(value = "/toLogin",method = RequestMethod.POST)
    @ResponseBody
    public String toLogin(@RequestParam("tel") String tel, @RequestParam("password") String password, HttpSession httpSession){
//        System.out.println(tel+" "+password);
//        User user = new User(tel,password);
//        if(userService.login(user)!=null){
////           System.out.println("yes");
//           return "success";
//       }
//       return "false";
       //存储用户输入的用户名和密码
        UsernamePasswordToken token = new UsernamePasswordToken(tel, password);
        //主体对象
        Subject subject = SecurityUtils.getSubject();
        User user = new User(tel, password);
        try {
            subject.login(token);
            httpSession.setAttribute("uid",userService.selectId(user));
            return "success";
        }catch (Exception e){
            return "false";
        }
    }
}
