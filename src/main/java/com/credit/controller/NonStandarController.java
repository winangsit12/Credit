package com.credit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("nonstandar")
public class NonStandarController {
    @GetMapping("")
    public String index(Model model){
        return "credit/non-standar";
    }
}
