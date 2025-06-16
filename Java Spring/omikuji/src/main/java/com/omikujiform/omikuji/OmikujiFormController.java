package com.omikujiform.omikuji;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class OmikujiFormController {
    @GetMapping("/omikuji/process")
    public String processForm(@RequestParam("number") int number, @RequestParam("city") String city,
            @RequestParam("person") String person, @RequestParam("hobby") String hobby,
            @RequestParam("livingThing") String livingThing, @RequestParam("niceMessage") String niceMessage,
            HttpSession session) {
        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("hobby", hobby);
        session.setAttribute("livingThing", livingThing);
        session.setAttribute("niniceMessage", niceMessage);
        return "redirect:/omikuji/show";
    }

    @GetMapping("/omikuji/show")
    public String showFortune(HttpSession session, Model model) {
        model.addAttribute("number", session.getAttribute("number"));
        model.addAttribute("city", session.getAttribute("city"));
        model.addAttribute("person", session.getAttribute("person"));
        model.addAttribute("hobby", session.getAttribute("hobby"));
        model.addAttribute("livingThing", session.getAttribute("livingThing"));
        model.addAttribute("niceMessage", session.getAttribute("niceMessage"));
        return "fortune.jsp";
    }
}
