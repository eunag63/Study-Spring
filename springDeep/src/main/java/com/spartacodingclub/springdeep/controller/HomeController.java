package com.spartacodingclub.springdeep.controller;

import com.spartacodingclub.springdeep.model.UserRole;
import com.spartacodingclub.springdeep.security.UserDetailsImpl;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        model.addAttribute("username", userDetails.getUsername());

        if (userDetails.getUser().getRole() == UserRole.ADMIN) {
            model.addAttribute("admin_role", true);
        }


        return "index";
    }
}