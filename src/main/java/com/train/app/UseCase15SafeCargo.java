package com.train.app;

public class UseCase15SafeCargo {

    public static void main(String[] args) {

        // Safe case
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        System.out.println();

        // Unsafe case
        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

        System.out.println();

        // Program continues
        GoodsBogie b3 = new GoodsBogie("Open");
        b3.assignCargo("Grain");
    }
}