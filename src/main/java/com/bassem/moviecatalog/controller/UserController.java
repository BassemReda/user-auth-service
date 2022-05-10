package com.bassem.moviecatalog.controller;

import com.bassem.moviecatalog.model.User;
import com.bassem.moviecatalog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    public ResponseEntity<String> login(@Valid @RequestBody User user) {
        User registeredUser = userRepository.findByEmail(user.getEmail());
        if (registeredUser == null)
            return new ResponseEntity<>( "User not found!", HttpStatus.NOT_FOUND);

        if ( !user.getPassword().equals(registeredUser.getPassword()) )
            return new ResponseEntity<>( "Incorrect password!", HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(user.toString(), HttpStatus.OK);
    }

}
