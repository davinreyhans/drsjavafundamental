package com.davin.drsjavafundamental.testharian.praktikum2;
/*
IntelliJ IDEA 2022.3.1 (Ultimate Edition)
Build #IU-223.8214.52, built on December 20, 2022
@Author Davin Reyhan S a.k.a. Davin Reyhan Setiawan
Java Developer
Created on 6/28/2023 4:07 PM
@Last Modified 6/28/2023 4:07 PM
Version 1.0
*/

import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intInput;
        double doJumlah = 0;
        int intCounter = 0;

        System.out.println("Input: ");
        try {
            while (true){
                intInput = scanner.nextInt();
                doJumlah += intInput;
                intCounter++;
            }
        } catch (Exception e) {
            double doAverage = doJumlah/intCounter;
            System.out.println("\nRata-rata: " + doAverage);
        } finally {
            System.out.println("\nDone.");
        }
    }
}


