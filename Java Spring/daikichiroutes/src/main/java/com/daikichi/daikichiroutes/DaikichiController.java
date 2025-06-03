package com.daikichi.daikichiroutes;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DaikichiController {
    @RequestMapping("/Daikichi")
    public String welcome(){
        return "Welcome!";
    }

    @RequestMapping("/Daikichi/Today")
    public String DaikichiToday (){
        return "Today you will find luck in all your endeavors!";
    }

    @RequestMapping("/Daikichi/Tomorrow")
    public String DaikichiTomorrow (){
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
}
