package com.rest.task.controllers;

import com.rest.task.dtos.UserRegistrationDto;
import com.rest.task.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public UserRegistrationDto create(@RequestBody UserRegistrationDto userRegistrationDto) {
        return service.create(userRegistrationDto);
    }
}
