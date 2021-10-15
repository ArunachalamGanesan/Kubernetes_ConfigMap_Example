package com.kubernetesConfigMapExample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    @Value("${country:default}")
    private String country;

    @GetMapping("/country")
    public String displayCountry(){
        log.info("country: {}",country);
        return country;
    }
}
