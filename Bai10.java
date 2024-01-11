package com.devmaster.baitap;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        int number = scanner.nextInt();

        if (SoHoanHao(number)) {
            System.out.println(number + " là số hoàn hảo.");
        } else {
            System.out.println(number + " không phải là số hoàn hảo.");
        }
    }

    public static boolean SoHoanHao(int num) {
        if (num <= 1) {
            return false;
        }

        int tongUocSo = 1;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                tongUocSo += i;
                if (i != num / i) {
                    tongUocSo += num / i;
                }
            }
        }

        return tongUocSo == num;
    }
}

