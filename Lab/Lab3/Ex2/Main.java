/*
❖ Lab03.2. N times of InputWrite a program to allow user to input N times of Number and find the values of average, max, min and sum:
Console:
How many number to be input?
Number of input: 5
Value #1: 3
Value #2: 55
Value #3: 26
Value #4: 95
Value #5: 43
Max: 95
Min: 3
Average: 44.4
Sum: 222
*/

package Ex2;

import utils.InputUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("How many number to be input?");
        int amountInput = InputUtils.getInteger("Number of input: ");
        double sum = 0, max = 0, min = 0, input;
        for (int i = 1; i <= 5; i++) {
            input = InputUtils.getDouble("Value #" + i + ": ");
            if (input > max)
                max = input;
            if (input < min)
                min = input;
            sum += input;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + sum / amountInput);
        System.out.println("Sum: " + sum);
    }
}
