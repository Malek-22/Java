package com.ninjagoldgame.ninjagoldgame;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/")
public class NonjaGoldController{
    
    @GetMapping("")
    public String index(HttpSession session) {
        if (session.getAttribute("gold") == null) {
            session.setAttribute("gold", 0);
            session.setAttribute("activities", new ArrayList<String>());
        }
        return "index.jsp";
    }

    @PostMapping("/process")
    public String process(@RequestParam("location") String location, HttpSession session) {
        int gold = (int) session.getAttribute("gold");
        List<String> activities = (List<String>) session.getAttribute("activities");

        int amount = switch (location) {
            case "farm" -> ThreadLocalRandom.current().nextInt(10, 21);
            case "cave" -> ThreadLocalRandom.current().nextInt(5, 11);
            case "house" -> ThreadLocalRandom.current().nextInt(2, 6);
            case "quest" -> ThreadLocalRandom.current().nextInt(-50, 51);
            case "spa" -> -ThreadLocalRandom.current().nextInt(5, 21);
            default -> 0;
        };

        gold += amount;
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd yyyy HH:mm a"));
        activities.add("You entered a " + location + " and " + (amount >= 0 ? "earned" : "lost") + " "
                + Math.abs(amount) + " gold. (" + timestamp + ")");

        session.setAttribute("gold", gold);
        session.setAttribute("activities", activities);

        if (gold < -100) {
            return "redirect:/debtorsPrison.jsp";
        }
        return "redirect:/";
    }

    @PostMapping("/reset")
    public String reset(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
