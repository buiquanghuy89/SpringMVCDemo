package com.demo.spring.controller;

import com.demo.spring.bo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by bqhuy on 11/14/2016.
 */
@Controller
@RequestMapping(value = "/user")
public class RequestParamExampleController {
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView user() {
        return new ModelAndView("user", "command", new User());
    }

    @RequestMapping(method = RequestMethod.POST)
    @ExceptionHandler({SpringException.class})
    public String addUser(@ModelAttribute("user") User user
            , ModelMap model) {
        if (user.getUserName() == null || user.getUserName().equals("")) {
            throw new SpringException("UserName is requirement");
        }
        model.addAttribute("userName", user.getUserName());
        model.addAttribute("email", user.getEmail());
        return "result";
    }
}