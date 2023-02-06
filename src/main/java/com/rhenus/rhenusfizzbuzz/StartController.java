package com.rhenus.rhenusfizzbuzz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    @RequestMapping("/")
    public String helloWorld(){
        FizzBuzz temp = new FizzBuzz();
        return temp.getFizzBuzz(36);
    }

    @RequestMapping("/test")
    public String goodbye(){
        return "test";
    }

}
