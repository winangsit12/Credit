package com.credit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pencairan")
public class PencairanController {
    @GetMapping("")
    public String index(Model model){
        return "credit/pencairan";
    }

    @GetMapping("form")
    public String indexform(Model model){
        return "credit/pencairan-proses";
    }
}

