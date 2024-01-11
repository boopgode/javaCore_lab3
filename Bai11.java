package com.devmaster.baitap;

import java.util.Scanner;
public class Bai11 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập giới hạn n: ");
            int n = scanner.nextInt();

            System.out.println("Các số hoàn hảo từ 1 đến " + n + " là:");
            inDaySoHoanHao(n);
        }

        public static void inDaySoHoanHao(int n) {
            for (int i = 1; i <= n; i++) {
                if (soHoanHao(i)) {
                    System.out.println(i);
                }
            }
        }

        public static boolean soHoanHao(int num) {
            if (num <= 1) {
                return false;
            }

            int tongUocSo = 1;

            // Tính tổng các ước của số
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

