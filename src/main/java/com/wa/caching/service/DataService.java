package com.wa.caching.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class    DataService {

    @Cacheable("data")
    public String getData(String param) {
        simulateSlowService();
        return "Data for " + param;
    }

    private void simulateSlowService() {
        try {
            TimeUnit.SECONDS.sleep(3); // Simulate a delay
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
