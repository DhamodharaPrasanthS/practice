package com.javalearning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = input.nextInt();
        System.out.println("Enter the values: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        for(int i=0; i<size;i++){
        System.out.println(array[i]);
    }




       }
    }



