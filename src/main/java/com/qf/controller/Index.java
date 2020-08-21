package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
// http://localhost:8082/
public class Index {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(){
//        System.out.println("yes");
        return "/login";
    }
    @RequestMapping(value = "/toLogin",method = RequestMethod.POST)
    @ResponseBody
    public String toLogin(@RequestParam("tel") String tel,@RequestParam("password") String password){
        System.out.println(tel+" "+password);
        User user = new User(tel,password);
        if(userService.login(user)!=null){
//           System.out.println("yes");
           return "success";
       }
       return "false";
    }
}
