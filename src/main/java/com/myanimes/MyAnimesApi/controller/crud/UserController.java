package com.myanimes.MyAnimesApi.controller.crud;

import com.myanimes.MyAnimesApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/crud/users")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserService userService;

}
