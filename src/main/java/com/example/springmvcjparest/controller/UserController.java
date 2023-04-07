package com.example.springmvcjparest.controller;

import com.example.springmvcjparest.model.User;
import com.example.springmvcjparest.repository.UserRepository;
import com.example.springmvcjparest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String user(){
        return "home";
    }

    @RequestMapping("user")
    public String userDetails(){
        return "user";
    }

    @RequestMapping("addUser")
    public String addUser(User user){
        userRepository.save(user);
        return "user";
    }

    @RequestMapping("getUser")
    public ModelAndView getUser(@RequestParam String firstname, @RequestParam String lastname){
        ModelAndView mv = new ModelAndView("showUser");
        User user = userRepository.findByFirstnameAndLastname(firstname, lastname);
        mv.addObject(user);
        return mv;
    }

    @RequestMapping("getUserAgeGreaterThan")
    public ModelAndView getUserAgeGreaterThan(@RequestParam int age){
        ModelAndView mv = new ModelAndView("showUser");
        List<User> users = userRepository.findUsersAgeGreaterThan(age);
        mv.addObject(users);
        System.out.println(users);
        return mv;
    }

    @RequestMapping("users")
    @ResponseBody
    public String getAllUsers(){
        List<User> users = userRepository.findAll();
        return users.toString();
    }

    @RequestMapping("user/10")
    @ResponseBody
    public String getSpecificUsers(){
        return userRepository.findById(10).toString();
    }

    @RequestMapping("user/{id}")
    @ResponseBody
    public String getSpecificUsersById(@PathVariable("id") int id){
        return userRepository.findById(id).toString();
    }

    @GetMapping("usermap")
    public ResponseEntity<User> getUserById(@RequestParam("id") int id){
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }
}
