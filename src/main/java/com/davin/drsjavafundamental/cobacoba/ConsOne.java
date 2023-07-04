package com.davin.drsjavafundamental.cobacoba;
/*
IntelliJ IDEA 2022.3.1 (Ultimate Edition)
Build #IU-223.8214.52, built on December 20, 2022
@Author Davin Reyhan S a.k.a. Davin Reyhan Setiawan
Java Developer
Created on 7/4/2023 8:10 PM
@Last Modified 7/4/2023 8:10 PM
Version 1.0
*/


public class ConsOne {
    private String name;
    private Integer value;

    public ConsOne(){
    }

    public ConsOne(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}


