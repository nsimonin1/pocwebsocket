package org.simon.pascal.controller;

import org.simon.pascal.util.DateUtil;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SimonPascal on 05/15/2016.
 */
@RestController
public class ClockController {


    @RequestMapping("/clock")
    public String clock(){
       return DateUtil.getTime();
    }
    @RequestMapping("/clock/{format}")
    public String clock(@PathVariable String format){
        return DateUtil.getTime(format);
    }
}
