package com.devmaster.baitap;

import java.util.Scanner;

public class Bai6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài 2 cạnh của hình chữ nhật: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        drawHollowRectangle(a, b);
    }

    public static void drawHollowRectangle(int a, int b) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (i == 1 || i == a || j == 1 || j == b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

}
