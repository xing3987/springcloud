package com.example.springCloudClientB.controller;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "springCloudClientA",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(path = "/hello/{name}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String index(@PathVariable(value = "name") String name);

}
