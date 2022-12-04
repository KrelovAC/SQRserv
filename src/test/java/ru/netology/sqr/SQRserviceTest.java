package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRserviceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/desired.csv")

    public void testLimited(int expected, int firstNumber, int secondNumber) {
        SQRService service = new SQRService();

        int actual = service.calculate(firstNumber, secondNumber);
        Assertions.assertEquals(expected, actual);
    }


}
