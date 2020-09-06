package com.lyit.multicloud.InventoryService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String health()
    {
       return "success controller from Cassandra";
    }

    @GetMapping("/health")
    public String healthDemo()
    {
        return "success controller from Cassandra for Demo!";
    }
}
