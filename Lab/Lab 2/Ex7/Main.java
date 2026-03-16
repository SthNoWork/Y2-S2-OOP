/*
❖ Lab02.7. Character counter
Write a program using to count number of Vowel, Consonant and Space:
Console:
Input a sentence: Hello classmate
Count of vowel is: 5
Count of consonant is: 9
Count of space is: 1
*/

package Ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a sentence: ");
        String sentence = input.nextLine();
        input.close();
        
        int vowel = 0;
        int consonant = 0;
        int space = 0;

        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } 
            else if (ch >= 'a' && ch <= 'z') {
                consonant++;
            } 
            else if (ch == ' ') {
                space++;
            }
        }

        System.out.println("Count of vowel is: " + vowel);
        System.out.println("Count of consonant is: " + consonant);
        System.out.println("Count of space is: " + space);
    }
}
