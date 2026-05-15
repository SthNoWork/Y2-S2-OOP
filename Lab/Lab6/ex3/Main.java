package ex3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("First GUI");
        f.setSize(400, 320);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("Count number of Vowel, Consonant and Space");
        title.setBounds(20, 15, 360, 20);
        f.add(title);

        JLabel textLabel = new JLabel("Text:");
        textLabel.setBounds(20, 45, 50, 20);
        f.add(textLabel);

        JTextField textField = new JTextField();
        textField.setBounds(20, 65, 200, 25);
        f.add(textField);

        JButton findBtn = new JButton("Find");
        findBtn.setBounds(20, 105, 80, 25);
        f.add(findBtn);

        JLabel vowelLabel = new JLabel("");
        vowelLabel.setBounds(20, 145, 300, 20);
        f.add(vowelLabel);

        JLabel consonantLabel = new JLabel("");
        consonantLabel.setBounds(20, 165, 300, 20);
        f.add(consonantLabel);

        JLabel spaceLabel = new JLabel("");
        spaceLabel.setBounds(20, 185, 300, 20);
        f.add(spaceLabel);

        findBtn.addActionListener(e -> {
            String text = textField.getText().toLowerCase();
            int vowels = 0, consonants = 0, spaces = 0;
            for (char c : text.toCharArray()) {
                if (c == ' ') spaces++;
                else if ("aeiou".indexOf(c) >= 0) vowels++;
                else if (Character.isLetter(c)) consonants++;
            }
            vowelLabel.setText("Count of vowel is: " + vowels);
            consonantLabel.setText("Count of consonant is: " + consonants);
            spaceLabel.setText("Count of space is: " + spaces);
        });

        f.setVisible(true);
    }
}