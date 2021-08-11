package com.epam.controller;


import com.epam.entity.User;
import com.epam.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public String start(Model model) {
        List<User> allUsers = userService.getAll();
        model.addAttribute("allUser", allUsers);
        return "users";
    }

    @GetMapping("/create")
    public String name(@RequestParam("name") String name, @RequestParam("email") String email) {
        userService.create(new User(name, email));
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        userService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/new")
    public String create() {
        return "user_add";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") int id, Model model) {
        model.addAttribute("id", id);
        return "user_add";
    }
}

