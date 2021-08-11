package com.epam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    //    @GetMapping("hello")
//    public String welcome(Principal principal, Model model) {
//        model.addAttribute("name", principal.getName());
//        return "welcome";
//    }
    @RequestMapping(value = "/hello")
    public String getProductName() {
        return "Honey";
    }
}
