package com.devmaster.baitap;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số N (> 0): ");
        int N = scanner.nextInt();

        System.out.println("a. Các số lẻ < N:");
        inSoLe(N);

        int b = tongBPSoLe(N);
        System.out.println("b. Tổng bình phương của các số lẻ < N là: " + b);

        System.out.println("c. Các số chẵn lớn hơn trung bình cộng của N số nguyên dương từ 1 tới N:");
        inSoChanTrenTrungBinh(N);
    }

    public static void inSoLe(int N) {
        for (int i = 1; i < N; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int tongBPSoLe(int N) {
        int tong = 0;
        for (int i = 1; i < N; i += 2) {
            tong += i * i;
        }
        return tong;
    }

    public static void inSoChanTrenTrungBinh(int N) {
        int tong = 0;
        for (int i = 1; i <= N; i++) {
            tong += i;
        }

        double tbc = (double) tong / N;

        for (int i = 2; i <= N; i += 2) {
            if (i > tbc) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

