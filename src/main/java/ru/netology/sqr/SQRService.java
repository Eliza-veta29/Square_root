package ru.netology.sqr;

public class SQRService {
    public int calcSqrtInRange(int min, int max) {
        int count = 0;

        for (int i = 10; i <= 100; i++) {
            if (max >= (i * i) && (i * i) >= min) {
                count++;
            }
        }
        return count;
    }
}
