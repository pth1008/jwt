package com.alibou.security.demo;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {


    @GetMapping("/login")
    public ModelAndView login(ModelMap model){
        ModelAndView modelAndView = new ModelAndView("Login");
        return modelAndView;
    }

}
