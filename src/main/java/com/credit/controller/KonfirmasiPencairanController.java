package com.credit.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("konfirmasi-pencairan")
public class KonfirmasiPencairanController {
    @GetMapping("")
    public String index(Model model){
        return "credit/konfirmasi-pencairan";
    }

    @GetMapping("ubah")
    public String updateinsert(Model model){
        return "credit/konfirmasi-pencairan-ubah";
    }
}
