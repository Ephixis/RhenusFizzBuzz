package com.rhenus.rhenusfizzbuzz;

public class FizzBuzz {

    public String getFizzBuzz(int length){

        String result="";

        for(int a=1; a<length; a++){

            if(a%15 == 0){
                result += "Fizzbuzz, ";
                continue;
            } else if (a%5==0) {
                result += "Buzz, ";
                continue;
            } else if (a%3 == 0) {
                result += "Fizz, ";
                continue;
            }
            result += a + ", ";
        }
        return result;
    }
}
