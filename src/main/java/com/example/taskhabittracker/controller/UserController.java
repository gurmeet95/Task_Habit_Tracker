package com.example.taskhabittracker.controller;

import com.example.taskhabittracker.entity.User;
import com.example.taskhabittracker.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }
    // CREATE USER
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    // GET ALL USERS
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    // GET USER BY ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}
