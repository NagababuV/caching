package com.wa.caching.controller;

import com.wa.caching.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/data")
    public String getData(@RequestParam String param) {
        return dataService.getData(param);
    }
}
