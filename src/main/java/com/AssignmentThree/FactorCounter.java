package com.AssignmentThree;
import java.util.Scanner;

public class FactorCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int count = countFactors(N);
        System.out.println(+count);
    }
    public static int countFactors(int N) {
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }
        return count;
    }
}
