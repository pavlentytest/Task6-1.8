package com.company;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
           a[i] = scan.nextInt();
        }
        int kol=0, minkol = 0, otvet =0;
        for(int i=0;i<n;i++) {
            kol=0;
            for(int j=0;j<n;j++) {
                if(a[j] == a[i]){
                    kol++;
                }
            }
            if(kol > minkol) {
                minkol = kol;
                otvet = i;
            }
        }
        System.out.println(a[otvet]);


    }
}

