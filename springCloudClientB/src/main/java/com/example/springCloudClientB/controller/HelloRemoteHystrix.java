package com.example.springCloudClientB.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String index(@PathVariable(value = "name") String name){
        return "Hystrix: hello " +name+", this messge send failed ";
    }
}