package com.vivatConsulting;

public class CheckNumbers {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void checkNumber(int n) throws NegativeNumberException {
        if (n < 0){
            throw new NegativeNumberException("\nНужно ввести положительное число" + n + "\nПопробуйте ещё раз:");
        }
        this.n = n;
    }
}
