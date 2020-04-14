package pl.aostaszewski.firstTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring boot";
    }
    @GetMapping("/hello2")
    public String hello2() {
        return "Hello2 Spring boot";
    }

}
