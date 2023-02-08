package com.rhenus.rhenusfizzbuzz;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FizzBuzzService {

    public List<String> getFizzBuzz(int length){

        List<String> results = new ArrayList<>();

        for(int a=1; a<length+1; a++){

            if(a%15 == 0){
                results.add("Fizzbuzz");
            } else if (a%5==0) {
                results.add("Buzz");
            } else if (a%3 == 0) {
                results.add("Fizz");
            }else {
                results.add(""+a);
            }
        }
        return results;
    }
}
