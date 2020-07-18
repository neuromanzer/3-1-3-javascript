package com.jm.springbootjs.controller;

import com.jm.springbootjs.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CurrentUserRest {

    @GetMapping("/current")
    public ResponseEntity<User> currentUser(Authentication authentication) {
        User currentUser = (User) authentication.getPrincipal();
        return currentUser != null
                ? new ResponseEntity<>(currentUser, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
