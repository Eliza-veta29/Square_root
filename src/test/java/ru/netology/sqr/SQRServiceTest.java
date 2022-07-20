package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/ForTests.csv")
    public void testSQRTInARange(int expected, int min, int max) {
        SQRService service = new SQRService();
        int actual = service.calcSqrtInRange(min, max);

    }

}
