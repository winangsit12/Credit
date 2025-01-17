package com.credit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("limit-pencairan")
public class LimitPencairanController {
    @GetMapping("")
    public String index(Model model){
        return "credit/limit-pencairan";
    }

    @GetMapping("lihat")
    public String view(Model model){
        return "credit/limit-pencairan-lihat";
    }

    @GetMapping("detail/banding")
    public String banding(Model model){
        return "credit/limit-pencairan-lihat-banding";
    }

    @GetMapping("lihat/nonstandar")
    public String nonStandar(Model model){
        return "credit/limit-pencairan-lihat-nonstandar";
    }

    @GetMapping("lihat/proses")
    public String proses(Model model){
        return "credit/limit-pencairan-lihat-proses";
    }
}
