package com.superred.demo.cloudeurekaclient8001.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Client8001Controller {

    @GetMapping("/test")
    public String testEureka() {
        log.info("===========client8001 run===============");
        return "===========client8001 run===============";
    }

}
