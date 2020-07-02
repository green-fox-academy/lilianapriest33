package com.greenfoxacademy.springstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloUserRESTController {

    @RequestMapping("/usergreeting")
    public Greeting userGreeting(@RequestParam String name) {
        return new Greeting(1, "Hello " + name);
    }
}