package com.example.lab3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField inputA;

    @FXML
    private TextField inputB;

    @FXML
    private TextField inputC;

    @FXML
    private Label resultLabel;

    @FXML
    protected void calculateMinimum() {
        try {
            int a = Integer.parseInt(inputA.getText());
            int b = Integer.parseInt(inputB.getText());
            int c = Integer.parseInt(inputC.getText());
            int min = findMin(a, b, c);
            resultLabel.setText("Minimum is: " + min);
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter valid integers.");
        }
    }

    // Метод для знаходження мінімального значення серед трьох чисел
    public int findMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
