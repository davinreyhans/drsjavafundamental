package com.davin.drsjavafundamental.testharian.praktikum3;
/*
IntelliJ IDEA 2022.3.1 (Ultimate Edition)
Build #IU-223.8214.52, built on December 20, 2022
@Author Davin Reyhan S a.k.a. Davin Reyhan Setiawan
Java Developer
Created on 7/5/2023 10:23 PM
@Last Modified 7/5/2023 10:23 PM
Version 1.0
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Praktikum3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int intInput;
        double doAverage;
        double doJumlah = 0;

        System.out.println("Input: ");

        try {
            while (true){
                intInput = scan.nextInt();
                list.add(intInput);
            }
        } catch (Exception e){
            System.out.println("INPUT STOPPED!\n");
        }
        finally {
            for (Integer i : list){
                doJumlah += i;
            }

            doAverage = doJumlah/list.size();

            System.out.println("User melakukan input sebanyak " + list.size() + " kali.");

            System.out.print("Dengan data input ");
            for (int i=0; i<list.size(); i++){
                if (i == list.size()-1){
                    if (list.size() == 1) {
                        System.out.print(" " + list.get(i));
                    } else {
                        System.out.print("dan " + list.get(i) + ".");
                    }
                } else {
                    System.out.print(list.get(i) + ", ");
                }
            }

            System.out.println("\nRata-rata: " + doAverage + ".");
        }
    }
}


