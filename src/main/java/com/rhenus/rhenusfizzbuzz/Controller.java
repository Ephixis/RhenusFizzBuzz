package com.rhenus.rhenusfizzbuzz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class Controller {

    private final FizzBuzzService fizzBuzzService;

    @Autowired
    public Controller(FizzBuzzService fizzBuzzService) {
        this.fizzBuzzService = fizzBuzzService;
    }

    @GetMapping("/FizzBuzz")
    public List<String> fizzBuzz(@RequestParam(value = "length", defaultValue = "36") int length) {
        return fizzBuzzService.getFizzBuzz(length);
    }
}
