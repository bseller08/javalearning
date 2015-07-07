package com.my.lecture1;

import java.util.ArrayList;
import java.util.List;

public class Lecture1 {

    public static void main(String[] args) {

        Driver driver = new Driver();
        Transport transport = new Poezd();
        driver.goFromAToB(transport);
        transport = new Kamaz();
        driver.goFromAToB(transport);

    }
}
