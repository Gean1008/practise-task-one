package com.vivatConsulting;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CheckNumbers numbers = new CheckNumbers();

        System.out.println("Введите размерность массива:");
        int n = -1;
        while(n < 0) {
            n = input.nextInt();
            try {
                numbers.checkNumber(n);
            }
            catch (NegativeNumberException e) {
                System.err.println(e);
            }
        }
        Object[] list = new Object[n];


        System.out.println("Введите маccив целых чисел:");
        for(int i = 0; i < list.length; i++) {
            list[i] = input.next();
            try{
                numbers.checkType(list[i]);
            }
            catch (TypeException e1){
                System.err.println(e1);
                i--;
            }
        }

        int sum = 0;
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i]+" ");
            sum += (int)list[i];
        }
        System.out.println("\nСумма элементов массива равна: " + sum);

    }
}
