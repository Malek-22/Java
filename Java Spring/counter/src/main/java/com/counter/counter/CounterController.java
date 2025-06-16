package com.counter.counter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
    @GetMapping("/")
    public String incrementCounter(HttpSession session) {
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 0;
        }
        counter++;
        session.setAttribute("counter", counter);
        return "redirect:/counter";
    }

    @GetMapping("/counter")
    public String showCounter(HttpSession session, Model model) {
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 0;
            session.setAttribute("counter", counter);
        }
        model.addAttribute("counter", counter);
        return "counter.jsp";
    }

    @GetMapping("/plusTwo")
    public String plustwoCounter(HttpSession session) {
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 0;
        }
        counter += 2;
        session.setAttribute("counter", counter);
        return "redirect:/counter";
    }

    @PostMapping("/rest")
    public String resetCounter(HttpSession session) {
        session.setAttribute("counter", 0);
        return "redirect:/counter";
    }

}
