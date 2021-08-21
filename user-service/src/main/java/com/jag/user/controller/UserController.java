package com.jag.user.controller;

import com.jag.user.entity.User;
import com.jag.user.service.UserService;
import com.jag.user.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user) {
        log.info("inside save user post method");
        return userService.saveUser(user);
    }


    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
        log.info("inside the getUserWithDepartment method");
        return userService.getUserWithDepartment(userId);
    }
}
