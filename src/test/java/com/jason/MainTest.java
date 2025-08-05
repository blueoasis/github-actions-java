package com.jason;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        // This test is a placeholder to ensure the Main class can be executed.
        // In a real-world scenario, you would test specific functionality of the Main class.
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }

    @Test
    void printMessage() {
        // Capture the output of the printMessage method
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        // Call the method to test
        Main.printMessage("Test message");

        // Verify the output
        assertEquals("Test message!\n", outContent.toString());

        // Reset the standard output
        System.setOut(System.out);
    }
}