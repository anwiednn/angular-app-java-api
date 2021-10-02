package com.example.javaapi.controllers;

import com.example.javaapi.services.abstractions.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/users")
public class UserController {
    private final IUserService _userService;

    @Autowired
    public UserController(IUserService _userService) {
        this._userService = _userService;
    }
}
