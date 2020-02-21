package com.app.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.app.webapp.model.User;
import com.app.webapp.model.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.http.MediaType;

/**
 * Main
 */
@Controller
@RequestMapping("/")
public class MainController {
    // Private fields
    @Autowired
    private UserDao userDao;

    @GetMapping()
    public String index(Model model) {

        model.addAttribute("app", "Simple spring app");
        
        return "index";
    }

    @PostMapping()
    public String helloWorld(Model model) {

        return "index";
    }

}