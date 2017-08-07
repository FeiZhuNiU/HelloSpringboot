package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Eric Yu on 2017/8/7.
 */
@RestController
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    String home(){
        return "hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }
}
