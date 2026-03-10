package Ex2;

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