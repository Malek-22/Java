package com.jsp.jstl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JstlController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name", "Malek");
        return "index.jsp";
    }
}
