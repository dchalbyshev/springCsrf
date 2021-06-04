package com.dchabyshev.springCsrf.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {

    @GetMapping
    public  String main(){

        return "main";
    }

    @PostMapping("/change")
    public String doSthing(){
        System.out.println(":(((");
        return "main";
    }




}
