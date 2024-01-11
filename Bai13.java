package com.devmaster.baitap;

import java.util.Scanner;
public class Bai13 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số n: ");
            int n = scanner.nextInt();

            System.out.print(n + " = ");
            thuaSoSoNguyen(n);
        }
        public static void thuaSoSoNguyen(int n) {
            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    System.out.print(i);
                    n /= i;
                    if (n > 1) {
                        System.out.print(" * ");
                    }//else System.out.println(" * 1");
                }
            }
            System.out.println();
        }
    }
