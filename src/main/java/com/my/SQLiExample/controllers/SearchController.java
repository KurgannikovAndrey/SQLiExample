package com.my.SQLiExample.controllers;

import com.my.SQLiExample.db.impl.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/search")
    public String getMainPage(Model model){
        return "search_page";
    }
}
