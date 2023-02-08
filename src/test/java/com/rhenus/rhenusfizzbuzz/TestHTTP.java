package com.rhenus.rhenusfizzbuzz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestHTTP {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void stringMatches(){
        assertEquals("[\"1\",\"2\",\"Fizz\",\"4\",\"Buzz\",\"Fizz\",\"7\",\"8\",\"Fizz\",\"Buzz\",\"11\",\"Fizz\",\"13\",\"14\",\"Fizzbuzz\",\"16\",\"17\",\"Fizz\",\"19\",\"Buzz\",\"Fizz\",\"22\",\"23\",\"Fizz\",\"Buzz\",\"26\",\"Fizz\",\"28\",\"29\",\"Fizzbuzz\",\"31\",\"32\",\"Fizz\",\"34\",\"Buzz\"]",
                testRestTemplate.getForObject("http://localhost:" + port + "/", String.class));
    }
}