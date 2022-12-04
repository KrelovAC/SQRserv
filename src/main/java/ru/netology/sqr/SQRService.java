package ru.netology.sqr;

public class SQRService {

    public int calculate(int firstNumber, int secondNumber) {
        int found = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= firstNumber) {
                if (i * i <= secondNumber) {

                    found = found + 1;

                }
            }
        }
        return found;
    }
}


