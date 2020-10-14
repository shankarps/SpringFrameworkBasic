package com.shankar.practice.springwebapp.controllers;

import com.shankar.practice.springwebapp.service.AuthorService;
import com.shankar.practice.springwebapp.service.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    private final GreetingService greetingService;

    public AuthorController(AuthorService authorService, GreetingService greetingService) {
        this.authorService = authorService;
        this.greetingService = greetingService;
    }

    @RequestMapping(name = "authors", path = "/authors")
    public String getAuthors(Model model){
        model.addAttribute("authors", authorService.findAll());
        model.addAttribute("greeting", greetingService.getGreetings());
        return "authors/list";
    }

}
