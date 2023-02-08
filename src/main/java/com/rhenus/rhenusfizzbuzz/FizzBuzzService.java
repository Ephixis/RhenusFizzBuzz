package com.rhenus.rhenusfizzbuzz;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FizzBuzzService {

    public List<String> getFizzBuzz(int length){

        List<String> results = new ArrayList<>();

        if(length<1)
            return List.of("Number must be >= 1!");

        for(int a=1; a<length; a++){

            if(a%15 == 0){
                results.add("Fizzbuzz");
                continue;
            } else if (a%5==0) {
                results.add("Buzz");
            } else if (a%3 == 0) {
                results.add("Fizz");
            }
            results.add(""+a);
        }
        return results;
    }
}
