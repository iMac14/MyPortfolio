package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "Your Name");
        model.addAttribute("skills", new String[] { "Skill 1", "Skill 2", "Skill 3" });
        model.addAttribute("experience",
                new String[] { "Application Support at SM Retail Headquarter",
                        "IT Technical Support at Jose Rizal University",
                        "Developer Internship at JCBA Solutions and Company" });
        return "home.html";
    }
}