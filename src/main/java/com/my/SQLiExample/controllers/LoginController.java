package com.my.SQLiExample.controllers;

import com.my.SQLiExample.db.impl.User;
import com.my.SQLiExample.db.impl.UserMapper;
import com.my.SQLiExample.db.impl.UserTable;
import com.my.SQLiExample.repository.UserTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    private UserTableRepository repository;

    @GetMapping("/login")
    public String getPage(Model model) {
        return "login_page";
    }

    @PostMapping("/login")
    public ModelAndView auth(Model model, @RequestParam String username, @RequestParam String password) {
        int i = jdbcTemplate.query("select * from users_table where password = '" + password + "' and username = '" + username + "';", new UserMapper()).size();
        return i!= 0 ? new ModelAndView("redirect:/search") : new ModelAndView("redirect:/login");
    }

    @GetMapping("/loginORM")
    public String getPageORM(Model model) {
        return "login_page_orm";
    }

    @PostMapping("/loginORM")
    public ModelAndView authORM(Model model, @RequestParam String username, @RequestParam String password) {
        boolean pass = false;
        for (UserTable user : repository.findAll()) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                pass = true;
                break;
            }
        }
        return pass ? new ModelAndView("redirect:/search") : new ModelAndView("redirect:/loginORM");
    }
}
