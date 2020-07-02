package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class WebGreetCounterController {
    private AtomicLong greetCount = new AtomicLong(1);

    @RequestMapping("/web/greetings")
    public String greeting(@RequestParam(value = "name") String name, Model model) {
        greetCount.getAndIncrement();
        model.addAttribute("name", " Viktoria");
        model.addAttribute("greetCount", greetCount);
        return "greeting";
    }
}
