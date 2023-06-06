package com.AssignmentThree;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args){
        int A,B,hcf=0;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        for(int i=1; i<=A || i<=B ;i++){
            if(A%i==0 && B%i==0){
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
