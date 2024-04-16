package com.example.sitraexampleproj.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class controller2 {

    @RequestMapping(value = "/cpa",method = RequestMethod.POST,consumes= "application/json")
    @ResponseBody
    public String cpa(@RequestBody login lo){
        return "hello";
    }
}
