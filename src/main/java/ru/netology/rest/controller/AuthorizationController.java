package ru.netology.rest.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.rest.model.Authorities;
import ru.netology.rest.model.User;
import ru.netology.rest.service.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {

    AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user) {
        return service.getAuthorities(user);
    }

}
