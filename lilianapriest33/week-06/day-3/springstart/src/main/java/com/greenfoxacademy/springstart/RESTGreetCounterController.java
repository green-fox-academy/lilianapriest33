package com.greenfoxacademy.springstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RESTGreetCounterController {
    AtomicLong greetCount = new AtomicLong(1);

    @RequestMapping("/greetingcount")
    public String greetingCounter(@RequestParam(value = "name") String name) {
        greetCount.getAndIncrement();
        return "greetcount: " + greetCount + ", " + "content: " + "Hello " + name;
    }
}