package com.socialmedia.userservice.controller;

import com.socialmedia.userservice.VO.ResponseTemplateVO;
import com.socialmedia.userservice.entity.User;
import com.socialmedia.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody @Valid User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUser(@PathVariable("id") Long userId) {
        return userService.getUserWithPosts(userId);
    }
}
