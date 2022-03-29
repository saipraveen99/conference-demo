package com.ps.demo.conferencepsdemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Value("${app.version}")
    private String version;

    @Value("${app.buildNo}")
    private String buildNo;

    @Value("${username}")
    private String dbUsername;

    @GetMapping("/")
    public Map status() {
        Map map = new HashMap<String, String>();
        map.put("app-version", version);
        map.put("build-number", buildNo);
        map.put("db-username", dbUsername);
        return map;
    }
}
