package com.devmaster.baitap;

import java.util.Scanner;

public class Bai8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N (> 0 và nhỏ hơn 16): ");
        int n = scanner.nextInt();
        if (n > 0 && n < 16) {
            int giaiThua = tinhGianThua(n);
            System.out.println("Giai thừa của " + n + " là: " + giaiThua);
        } else {
            System.out.println("Vui lòng nhập số N lớn hơn 0 và nhỏ hơn 16.");
        }
    }

    public static int tinhGianThua(int n) {
        int giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        return giaiThua;
    }
}
