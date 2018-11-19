package com.company;

public class GuessGame {

    public int generateRandomNumber(int n) {
        int result = 0;
        result = (int) (Math.random() * n) + 1;
        return result;
    }
}
