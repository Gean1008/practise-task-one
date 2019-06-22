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
//            catch (InputMismatchException e) {
//                System.err.println("\nНужно вводить целые числа\nПопробуйте ещё");
//                n = -1;
//            }
            catch (NegativeNumberException e1) {
                System.err.println(e1);
            }
        }
        int[] list = new int[n];


        System.out.println("Введите маccив целых чисел:");
        for(int i = 0; i < list.length; i++) {
//            try{
                list[i] = input.nextInt();
//            }
//            catch (InputMismatchException e){
//                System.err.println("\nНужно вводить целые числа\nПопробуйте ещё");
//                list[i] = input.nextInt();
//            }
        }

        int sum = 0;
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i]+" ");
            sum += list[i];
        }
        System.out.println("\nСумма элементов массива равна: " + sum);

    }
}
