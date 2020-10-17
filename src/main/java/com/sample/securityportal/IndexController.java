package com.sample.securityportal;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getCredentials());
        return "index";
    }

}