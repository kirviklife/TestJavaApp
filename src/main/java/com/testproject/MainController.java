package com.testproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/index")
    public String param(@RequestParam(name="name", required=false, defaultValue="МИР") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

}
