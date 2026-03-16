/*
❖ Lab02.1.  Hello One’s Name
Implement an application Java that displays “Hello <input_name>!” where <input_name> 
represents user input from keyboard. Example: 
Console:
Input your name: Visal
Hello Visal!
*/

package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = input.nextLine();
        input.close();
        System.out.println("Hello " + name + "!");
    }
}