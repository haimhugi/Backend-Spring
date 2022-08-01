package com.server.Backend.controllers;


import com.server.Backend.models.User;
import com.server.Backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {


    public final UserService us;

    @GetMapping()
    @CrossOrigin
    public List<User> getAll(){
        return us.getAll();
    }

    @GetMapping("/{id}")
    @CrossOrigin
    public Optional<User> getUser(@PathVariable String id){
        return us.getUserById(id);
    }

    @PostMapping("/add-user")
    @CrossOrigin
    public User createUser(@RequestBody User user){
        return us.createUser(user);
    }

    @PostMapping("/{id}")
    @CrossOrigin
    public User updateUser(@RequestBody User user){
        return us.updateUser(user);
    }

    @DeleteMapping()
    @CrossOrigin
    public void deleteUser(@RequestBody User user){
        us.deleteUser(user);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin
    public void deleteUser(@PathVariable String id){
        us.deleteUserById(id);
    }

}
