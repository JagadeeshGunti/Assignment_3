package com.AssignmentThree;
import java.util.Scanner;

public class ArmstrongNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int number = 1; number <= N; number++) {
            int sum = 0;
            int originalNumber = number;

            // Sum of cubes of each digit
            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                sum += digit * digit * digit;
                originalNumber /= 10;
            }

            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}
