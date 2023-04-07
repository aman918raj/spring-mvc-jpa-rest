package com.example.springmvcjparest.service;

import com.example.springmvcjparest.exception.UserException;
import com.example.springmvcjparest.model.User;
import com.example.springmvcjparest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUserById(int id){
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()){
            throw new UserException("Id not found or server is down " + id, HttpStatus.NOT_FOUND);
        }

        return user.get();
    }

}
