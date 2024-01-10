package com.devmaster.baitap;

import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập chiều cao của tam giác
        System.out.print("Nhập chiều cao của tam giác: ");
        int h = scanner.nextInt();
        // Vẽ tam giác cân rỗng
        VTG(h);
    }

    public static void VTG(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" "); // In các khoảng trắng bên trái
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == h) {
                    System.out.print("*"); // In dấu '*' ở mép và đỉnh tam giác
                } else {
                    System.out.print(" "); // In khoảng trắng ở giữa tam giác
                }
            }

            System.out.println(); // Xuống dòng cho dòng tiếp theo
        }
    }
}
