package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int m = scan.nextInt();
         int[][] a = new int[n][m];
         for(int i=0;i<n;i++) {
             for(int j=0;j<m;j++) {
                 a[i][j] = scan.nextInt();
             }
         }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
