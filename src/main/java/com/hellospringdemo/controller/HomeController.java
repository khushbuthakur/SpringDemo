package com.hellospringdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author khushbu
 * @date 12/5/21 4:53 PM
 */

@Controller
public class HomeController {

    /**
     * root directory
     * whenever / is hit this request will be called
     * */
    @RequestMapping("/")
    public String home(){
        return "home";
    }
}
