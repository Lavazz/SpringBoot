package com.epam.training.controller;

import com.epam.training.entity.User;
import com.epam.training.service.UserServiceImpl;
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

    UserServiceImpl userServiceImpl;


    @GetMapping("/")
    public String start(Model model) {
        List<User> allUsers = userServiceImpl.getAll();
        model.addAttribute("allUser", allUsers);
        return "users";
    }

    @GetMapping("/create")
    public String name(@RequestParam(value = "id", required = false) String id, @RequestParam("name") String name, @RequestParam("email") String email) {
        User user;
        if (id.equals("")) {
            user = new User();
        } else {
            user = userServiceImpl.findById(Long.parseLong(id));
        }
        user.setName(name);
        user.setEmail(email);
        userServiceImpl.create(user);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        userServiceImpl.delete(id);
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

