package com.davin.drsjavafundamental.cobacoba;
/*
IntelliJ IDEA 2022.3.1 (Ultimate Edition)
Build #IU-223.8214.52, built on December 20, 2022
@Author Davin Reyhan S a.k.a. Davin Reyhan Setiawan
Java Developer
Created on 6/29/2023 9:12 PM
@Last Modified 6/29/2023 9:12 PM
Version 1.0
*/

public class MethodSatu {
    public static void main(String[] args) {
        double doA = 5.1;
        double doB = 15;
        double doC = 19;

        System.out.println(LuasPersegi(doC));
        System.out.println(LuasLayangLayang(doA,doC));
    }

    public static double LuasPersegi(double doS){
        double doLuas = doS*doS;
        return doLuas;
    };

    public static double LuasLayangLayang(double doD1, double doD2){
        double doLuas = (doD1*doD2)/2;
        return doLuas;
    }
}


