package org.hand.sayhellojenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class testController {

    @RequestMapping(value = "/")
    public String say(){
        return "hello jenkins" + new Date();
    }
}
