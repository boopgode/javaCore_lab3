package com.devmaster.baitap;

public class Bai4 {
    public static void main(String[] args) {
        Bai4 bai4 = new Bai4();
//        if(bai4.KTSNT(20)){
//            System.out.println("Là số nguyên tố");
//        }else System.out.println("Không phải số nguyên tố");
        System.out.println("dãy số nguyên tố :");
        for (int i = 2; i < 100; i++) {
            if (bai4.KTSNT(i)) System.out.printf("%d ", i);
        }
    }

    boolean KTSNT(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
}
