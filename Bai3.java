package com.devmaster.baitap;

public class Bai3 {
    int ucln(int x, int y) {
        int ucln = 1;
        int n = x < y ? x : y;
        for (int i = n; i > 0; i--) {
            if (x % i == 0 && y % i == 0) {
                ucln = i;
                break;
            }
        }
        return ucln;
    }

    int bcnn(int x, int y) {
//        return Math.abs(x * y) / ucln(x, y);
        int bcnn = 1;
        int n = x * y;
        for (int i = 1; i < n; i++) {
            if (i % x == 0 && i % y == 0) {
                bcnn = i;
                break;
            }
        }
        return bcnn;
    }

    public static void main(String[] args) {
        Bai3 bai3 = new Bai3();
        int ucln3 = bai3.ucln(30, 20);
        int bcnn3 = bai3.bcnn(30, 20);
        System.out.println("ucln: " + ucln3);
        System.out.println("bcnn: " + bcnn3);
    }
}
