package com.example.lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class HelloControllerTest {
    private final HelloController controller = new HelloController();

    @Test
    public void testFindMin() {
        assertEquals(-5, controller.findMin(3, -5, 8));
    }
}