package ex4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("First GUI");
        f.setSize(400, 350);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("Find roots of quadratic equation ax^2+ bx +c=0");
        title.setBounds(20, 15, 360, 20);
        f.add(title);

        JLabel aLabel = new JLabel("a=");
        aLabel.setBounds(20, 45, 30, 20);
        f.add(aLabel);

        JTextField aField = new JTextField();
        aField.setBounds(20, 65, 200, 25);
        f.add(aField);

        JLabel bLabel = new JLabel("b=");
        bLabel.setBounds(20, 100, 30, 20);
        f.add(bLabel);

        JTextField bField = new JTextField();
        bField.setBounds(20, 120, 200, 25);
        f.add(bField);

        JLabel cLabel = new JLabel("c=");
        cLabel.setBounds(20, 155, 30, 20);
        f.add(cLabel);

        JTextField cField = new JTextField();
        cField.setBounds(20, 175, 200, 25);
        f.add(cField);

        JButton findBtn = new JButton("Find");
        findBtn.setBounds(20, 215, 80, 25);
        f.add(findBtn);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(20, 255, 340, 20);
        f.add(resultLabel);

        findBtn.addActionListener(e -> {
            double a = Double.parseDouble(aField.getText());
            double b = Double.parseDouble(bField.getText());
            double c = Double.parseDouble(cField.getText());
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                resultLabel.setText("x1 = " + x1 + ",  X2 = " + x2);
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
                resultLabel.setText("x1 = x2 = " + x);
            } else {
                resultLabel.setText("No real roots");
            }
        });

        f.setVisible(true);
    }
}