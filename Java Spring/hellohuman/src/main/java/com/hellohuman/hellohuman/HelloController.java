package com.hellohuman;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(@RequestParam(value = "name", defaultValue = "human") String name,
                        @RequestParam(value = "last_name", required = false) String lastName,
                        @RequestParam(value = "times", required = false) Integer times) {

        String greeting;
        if (lastName != null && !lastName.isEmpty()) {
            greeting = "Hello " + name + " " + lastName;
        } else {
            greeting = "Hello " + name;
        }

        if (times != null && times > 0) {
            return greeting.repeat(times);
        }

        return greeting;
    }
}
