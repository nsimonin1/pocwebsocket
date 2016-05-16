package org.simon.pascal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SimonPascal on 05/13/2016.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "redirect:/clock.htm";
    }

    @RequestMapping("/clock.htm")
    public String start(){
        return "clock";
    }
}
