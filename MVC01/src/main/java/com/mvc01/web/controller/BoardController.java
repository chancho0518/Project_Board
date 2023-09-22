package com.mvc01.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class BoardController {

    @GetMapping("/boardlist")
    public String boardList() {

        return "boardList";
    }
}
