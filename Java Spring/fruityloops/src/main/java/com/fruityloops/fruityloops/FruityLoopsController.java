package com.fruityloops.fruityloops;

import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fruityloops.fruityloops.models.Item;

public class FruityLoopsController {
    @RequestMapping("/")
    public String index(Model model) {
        ArrayList<Item> fruits = new ArrayList<>();
        fruits.add(new Item("kiwi", 1.5));
        fruits.add(new Item("Mango", 2.0));
        fruits.add(new Item("Goji Berries", 4.0));
        fruits.add(new Item("Guava", 0.75));

        model.addAttribute("fruits", fruits);

        return "index.jsp";
    }
}
