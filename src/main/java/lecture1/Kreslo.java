package com.my.lecture1;

public class Kreslo extends Stul {

    @Override
    public void sit() {
        System.out.println("Sleep");
    }

    public void relax() {
        System.out.println("расслабляемся");
    }

    public void sleep() {
        System.out.println("Sleep");
    }

    /**
     *
     * Taburet
     *   |
     * Stul
     *   |
     * Kreslo
     *
     */
}
