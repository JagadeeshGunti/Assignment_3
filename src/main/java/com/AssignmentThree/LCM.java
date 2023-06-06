package com.AssignmentThree;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int lcm = (A > B) ? A : B;
        while(true) {
            if( lcm % A == 0 && lcm % B == 0 ) {
                System.out.print(lcm);
                break;
            }
            ++lcm;
        }
    }
}
