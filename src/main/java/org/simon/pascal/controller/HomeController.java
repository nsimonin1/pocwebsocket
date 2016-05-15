package org.simon.pascal.controller;

import org.simon.pascal.domains.CalcInput;
import org.simon.pascal.domains.Result;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SimonPascal on 05/13/2016.
 */
@Controller
public class HomeController {


    @RequestMapping("/echo.html")
    public String start(){
        return "echo";
    }
}
