package com.devmaster.baitap;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập vào số n:");
//        int n = sc.nextInt();
//        int tong=0;
//
//        for (int i=0;i<=n;i++){
//            tong+= i;
//
//        }
//        System.out.println("tong "+tong);
        Bai2 bai2= new Bai2();
        // int
//        int s= bai2.xuatTong2(10);
//        System.out.println("tong từ 1 đến 10 = "+s);

        bai2.xuatTong2(100);// void

    }
    void xuatTong2(int n){
        int s=0;
        for (int i=1;i<=n;i++){
            s+=i;
        }
        System.out.println("tong từ 1 đến "+n+" = "+s);
    }
//     int xuatTong(int n){
//        int s=0;
//        for (int i=1;i<=n;i++){
//            s+=i;
//        }
//        return s;
//     }

}
