package com.example.maintenancemonitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageControllerTest {

    @Test
    void getMessage() {
        MessageController controller = new MessageController();
        assertEquals("Everything works as expected", controller.getMessage());
        controller.setMessage("This is a test message");
        assertEquals("This is a test message",controller.getMessage());

    }
}