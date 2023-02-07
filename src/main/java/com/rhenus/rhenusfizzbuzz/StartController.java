package com.rhenus.rhenusfizzbuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import java.util.List;

@RestController
public class StartController {

    private final FizzBuzzService fizzBuzzService;

    @Autowired
    public StartController(FizzBuzzService fizzBuzzService) {
        this.fizzBuzzService = fizzBuzzService;
    }

    @RequestMapping("/FizzBuzz")
    public List helloWorld(){
        return fizzBuzzService.getFizzBuzz(36);
    }

    @RequestMapping("/")
    public String goodbye(){
        return "Length";
    }

}
