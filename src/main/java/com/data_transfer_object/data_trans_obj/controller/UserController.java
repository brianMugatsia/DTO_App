package com.data_transfer_object.data_trans_obj.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.data_transfer_object.data_trans_obj.entity.User;
import com.data_transfer_object.data_trans_obj.dto.UserDto;

import com.data_transfer_object.data_trans_obj.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User userCreated = this.userService.createUser(user);
        return new ResponseEntity<>(userCreated, HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUser(@PathVariable int userId) {
        UserDto userDto = this.userService.getUser(userId);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
}