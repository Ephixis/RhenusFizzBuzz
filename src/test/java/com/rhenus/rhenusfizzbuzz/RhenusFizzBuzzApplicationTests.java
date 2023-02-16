package com.rhenus.rhenusfizzbuzz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RhenusFizzBuzzApplicationTests {

    @Test
    void contextLoads() {
    }

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    // Checks if FizzBuzz returns the correct sequence.
    @Test
    public void passIfStringMatches(){
        FizzBuzzService fb = new FizzBuzzService();
        assertEquals("[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizzbuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizzbuzz, 31, 32, Fizz, 34, Buzz, Fizz]", fb.getFizzBuzz(36).toString());
    }

    // Checks if index.HTML is served on application start.
    @Test
    public void passIfHTMLWasServed(){

        StringBuilder contentBuilder = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader("src/main/resources/Public/index.html"));
            String str;
            while ((str = in.readLine()) != null) {
                contentBuilder.append(str);
            }
            in.close();
        } catch (IOException e) {

        }
        String content = contentBuilder.toString();
        assertEquals(content.replaceAll("\\s", ""), testRestTemplate.getForObject("http://localhost:" + port + "/", String.class).replaceAll("\\s", ""));
    }
}
