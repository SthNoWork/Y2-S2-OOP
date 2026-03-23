/*
❖ Lab02.6. Prime Number
Prime number is positive number greater than 2 and divisible only to its own and 1.
Implement an application Java that let user input a number then determine if it is a prime number
Example 01. Console:
Input a number to check whether it is a prime number: 29
29 is a prime number.
Example 02. Console:
Input a number to check whether it is a prime number: 57
57 is not a prime number, because it is divisible by 3.
*/

package Ex6;

import java.util.Scanner;

public class Main {

    // Recursive function to check prime
    public static boolean isPrime(int n, int i) {
        if (n <= 2)
            return (n == 2);          // 2 is prime
        if (n % i == 0)
            return false;             // divisible → not prime
        if (i * i > n)
            return true;              // no divisor found

        return isPrime(n, i + 1);     // recursive call
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number to check whether it is a prime number: ");
        int num = input.nextInt();

        input.close();

        if (isPrime(num, 2)) {
            System.out.println(num + " is a prime number.");
        } else {
            // find a divisor for explanation
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number, because it is divisible by " + i + ".");
                    break;
                }
            }
        }
    }
}