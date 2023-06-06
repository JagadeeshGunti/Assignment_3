package com.AssignmentThree;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int A = 0;
        int cout = 0;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        for (int i = 1; i<=A ; i++) {
            if (A % i == 0){
                cout++;
            }
        }
        if (cout==2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
