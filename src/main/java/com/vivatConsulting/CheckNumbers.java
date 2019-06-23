package com.vivatConsulting;

public class CheckNumbers {
    private int n;
    private Object num;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void checkNumber(int n) throws NegativeNumberException {
        if (n < 0){
            throw new NegativeNumberException("\nНужно ввести положительное число\nПопробуйте ещё раз:");
        }
        this.n = n;
    }

    public Object getNum() {
        return num;
    }

    public void setNum(Object num) {
        this.num = num;
    }

    public void checkType(Object num) throws TypeException{
        if(!(num instanceof Number)) {
            throw new TypeException("Нужно ввести целое число\nПопробуйте ещё раз:");
        }
        this.num = num;
    }
}
