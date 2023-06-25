package com.davin.drsjavafundamental.testharian.praktikum1;
/*
IntelliJ IDEA 2022.3.1 (Ultimate Edition)
Build #IU-223.8214.52, built on December 20, 2022
@Author Davin Reyhan S a.k.a. Davin Reyhan Setiawan
Java Developer
Created on 6/25/2023 2:42 PM
@Last Modified 6/25/2023 2:42 PM
Version 1.0
*/

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        System.out.print("Masukkan Kata\t: ");
//        Jquery 1995@v1.0
//        Bebas Lepas@
//        Tid4k $@ma

        Scanner scanner = new Scanner(System.in);
        String strInput = scanner.nextLine();

        int intHasil = 0;
        char chInput;
        int intConvert;

        for (int i=0; i<strInput.length(); i++)
        {
            chInput = strInput.charAt(i);
            intConvert = chInput;
            if (
                    (intConvert>=32 && intConvert<=47)  || //simbol part1
                            (intConvert>=58 && intConvert<=64)  || //simbol part2
                            (intConvert>=91 && intConvert<=96)  || //simbol part3
                            (intConvert>=123 && intConvert<=126)|| //simbol part4
                            (intConvert>=48 && intConvert<=57)  || //angka
                            (intConvert>=65 && intConvert<=90)     //huruf kapital
            )
            {
                intHasil += intConvert;
            }
        }
        System.out.print("Hasil\t\t\t: "+intHasil);
    }
}




