package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private String message = "Everything works as expected";

    @GetMapping("/api/message")
    public String getMessage() {
        return message;
    }

    @GetMapping("/api/message/set")
    public String setMessage(@RequestParam String m) {
        this.message = m;
        return "ok";
    }

    @GetMapping("/api/message/reset")
    public String resetMessage() {
        this.message = "Everything works as expected";
        return "ok";
    }
}