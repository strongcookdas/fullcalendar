package com.example.fullcalendar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FullCalendarController {

    @GetMapping("/")
    public String getFullCalendar(){
        return "index";
    }
}
