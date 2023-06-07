package com.example.uptimedowntimecalculatorv2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/api/downtime")
    public int calcDownTime(@RequestParam double percentage){
        
    }
}
