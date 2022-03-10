package com.bridgelaqbz;

public class LINE_COMPARISON {
    public static void main(String[] args) {
        LINE_COMPARISON object = new LINE_COMPARISON();
        object.UC_1();
        System.out.println("welcome to the Line comparison program");
    }

    public void UC_1() {
        double x1 = 2, x2 = 5, y1 = 4, y2 = 6;
        double length;
        length = Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2);
        System.out.println("length of the line : " + length);
    }
}




