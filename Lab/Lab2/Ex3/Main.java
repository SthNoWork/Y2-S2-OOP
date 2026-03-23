/*
❖ Lab02.3. Health Screening Questions
Write a program to ask questions for checking Health regarding to Covid-19
Console:
==== Covid-19 Screen Health ===
Q1. Feeling feverish and/or having chills? Yes
Q2. Has there been any use of fever reducing medication within the last 24 hours not due to another health
condition? No
Q3. A new cough that is not due to another health condition? No
Q4. New chills that are not due to another health condition? No
Q5. A new sore throat that is not due to another health condition? No
Q6. A new loss of taste or smell? Yes
Q7. Have you had a positive test for the virus that causes COVID-19
disease within the past 10 days? No
Q8. In the past 14 days, have you had close contact (within about 6 feet for 15 minutes or more) with someone with
suspected or confirmed COVID-19? Yes
=================================================
|        Questions       |        Answers       |
=================================================
| Q1                     | Yes                  |
-------------------------------------------------
| Q2                     | No                   |
-------------------------------------------------
| Q3                     | No                   |
-------------------------------------------------
| Q4                     | No                   |
-------------------------------------------------
| Q5                     | No                   |
-------------------------------------------------
| Q6                     | Yes                  |
-------------------------------------------------
| Q7                     | No                   |
-------------------------------------------------
| Q8                     | Yes                  |
*/
package Ex3;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==== Covid-19 Screen Health ===");
        LinkedHashMap<String, String> qna = new LinkedHashMap<>();

        qna.put("Q1", getStringInput(input, "Q1. Feeling feverish and/or having chills? "));
        qna.put("Q2", getStringInput(input, "Q2. Has there been any use of fever reducing medication within the last 24 hours not due to another health condition? "));
        qna.put("Q3", getStringInput(input, "Q3. A new cough that is not due to another health condition? "));
        qna.put("Q4", getStringInput(input, "Q4. New chills that are not due to another health condition? "));
        qna.put("Q5", getStringInput(input, "Q5. A new sore throat that is not due to another health condition? "));
        qna.put("Q6", getStringInput(input, "Q6. A new loss of taste or smell? "));
        qna.put("Q7", getStringInput(input, "Q7. Have you had a positive test for the virus that causes COVID-19 disease within the past 10 days? "));
        qna.put("Q8", getStringInput(input, "Q8. In the past 14 days, have you had close contact (within about 6 feet for 15 minutes or more) with someone with suspected or confirmed COVID-19? "));
        input.close();

        System.out.println("=".repeat(35));
        System.out.printf("|%-15s |%-15s |%n", "Questions", "Answer");
        System.out.println("=".repeat(35));
        // for (Map.Entry<String, String> entry : qna.entrySet()) {
        for (var entry : qna.entrySet()) {
            System.out.printf("|%-15s |%-15s |%n", entry.getKey(), entry.getValue());
            System.out.println("-".repeat(35));
        }

    }

    public static String getStringInput(Scanner input, String question) {
        System.out.print(question);
        return input.nextLine();
    }
}
