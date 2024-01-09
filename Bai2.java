package com.devmaster.baitap;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số n:");
        int n = sc.nextInt();
        int tong=0;

        for (int i=0;i<=n;i++){
            tong+= i;

        }
        System.out.println("tong "+tong);
    }

}
