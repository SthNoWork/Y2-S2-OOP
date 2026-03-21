/*
❖ Lab02.2. Currency converter
Write a program in Java to money in Riels to Dollar. Suppose that conversion rate is 1$ = 4000៛. Example:
Console:
Program for converting money in Riels to Dollars.
Please input conversion rate of 1 dollar in Riels: 4000
Please input money to exchange in Riels: 2200
2200 RIELS = 0.55 USD
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program for converting money in Riels to Dollars.");
        System.out.print("Please input conversion rate of 1 dollar in Riels: ");
        double rate = input.nextDouble();
        System.out.print("Please input money to exchange in Riels: ");
        double money = input.nextDouble();
        input.close();
        System.out.println(money + " RIELS = " + money/rate + " USD");
    }
}