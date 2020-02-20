package com.example.conference.controller;

import com.example.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname", defaultValue = "Super") String fisrtname,
                        @RequestParam(value = "lastname", defaultValue = "Smash Bros.") String lastname,
                        @RequestParam(value = "age", defaultValue = "33") int age) {
        User user = new User();
        user.setFirstname(fisrtname);
        user.setLastname(lastname);
        user.setAge(age);
        return user;
    }

    @PostMapping("user")
    public User postUser(User user){
        System.out.println("User firstname:" + user.getFirstname());
        return user;
    }

}
