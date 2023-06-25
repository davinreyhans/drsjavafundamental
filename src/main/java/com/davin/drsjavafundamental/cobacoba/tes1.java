package com.davin.drsjavafundamental.cobacoba;
/*
IntelliJ IDEA 2022.3.1 (Ultimate Edition)
Build #IU-223.8214.52, built on December 20, 2022
@Author Davin Reyhan S a.k.a. Davin Reyhan Setiawan
Java Developer
Created on 6/25/2023 2:02 AM
@Last Modified 6/25/2023 2:02 AM
Version 1.0
*/

public class tes1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String strInput = scanner.nextLine();
        String strInput = "Jquery 1995@v1.0";
//        String strInput = "Bebas Lepas@";

        int intHasil = 0;
        char chInput;
        int intConvert;

        System.out.println("Sebelum convert ASCII --> "+strInput);

        for (int i=0; i<strInput.length(); i++)
        {
            chInput = strInput.charAt(i);
            intConvert = chInput;
            if ((intConvert>=32 && intConvert<=47) || //simbol1
                    (intConvert>=58 && intConvert<=64) || //simbol2
                    (intConvert>=91 && intConvert<=96) || //simbol3
                    (intConvert>=123 && intConvert<=126) ||//simbol4
                    (intConvert>=48 && intConvert<=57) || //angka
                    (intConvert>=65 && intConvert<=90) //huruf kapital
            )
            {
                intHasil += intConvert;
            }
        }

        System.out.println("Setelah convert ASCII --> "+intHasil);
    }
}


