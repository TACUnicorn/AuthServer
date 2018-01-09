package com.unicorn.authserver.controller;

import com.unicorn.authserver.domain.SysUser;
import com.unicorn.authserver.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    SysUserRepository repository;

    @GetMapping("/user")
    public Principal user(Principal user){
        return user;
    }

    @GetMapping("/users")
    public List<SysUser> users(){
        return repository.findAllByUsernameNotNull();
    }

    @PostMapping("/users")
    public SysUser create(@RequestBody SysUser user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        user.setPassword(encoder.encode(user.getPassword()));

        repository.save(user);
        return user;
    }


}
