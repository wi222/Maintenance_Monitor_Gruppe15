package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceController {
    private String message = "Everything works as expected";

    @GetMapping("/api/message")
    public String getMessage() {
        return message;
    }
}
