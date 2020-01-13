package com.hassan.gratitude.journal.gratitudejournal.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hassan.gratitude.journal.gratitudejournal.data.entity.Users;
import com.hassan.gratitude.journal.gratitudejournal.data.repository.UsersRepository;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping
    public Iterable<Users> findAll(){
        return usersRepository.findAll();
    }
}
