package ex5;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("First GUI");
        f.setSize(400, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("Caclulator");
        title.setBounds(20, 10, 200, 20);
        f.add(title);

        JLabel aLabel = new JLabel("A=");
        aLabel.setBounds(20, 35, 30, 20);
        f.add(aLabel);

        JTextField aField = new JTextField();
        aField.setBounds(20, 55, 180, 25);
        f.add(aField);

        JLabel bLabel = new JLabel("B=");
        bLabel.setBounds(20, 88, 30, 20);
        f.add(bLabel);

        JTextField bField = new JTextField();
        bField.setBounds(20, 108, 180, 25);
        f.add(bField);

        JButton addBtn = new JButton("A + B");
        addBtn.setBounds(20, 145, 80, 25);
        f.add(addBtn);

        JLabel addResult = new JLabel("=");
        addResult.setBounds(20, 178, 200, 20);
        f.add(addResult);

        JButton subBtn = new JButton("A - B");
        subBtn.setBounds(20, 208, 80, 25);
        f.add(subBtn);

        JLabel subResult = new JLabel("=");
        subResult.setBounds(20, 241, 200, 20);
        f.add(subResult);

        JButton mulBtn = new JButton("A * B");
        mulBtn.setBounds(20, 271, 80, 25);
        f.add(mulBtn);

        JLabel mulResult = new JLabel("=");
        mulResult.setBounds(20, 304, 200, 20);
        f.add(mulResult);

        JButton divBtn = new JButton("A / B");
        divBtn.setBounds(20, 334, 80, 25);
        f.add(divBtn);

        JLabel divResult = new JLabel("=");
        divResult.setBounds(20, 367, 200, 20);
        f.add(divResult);

        addBtn.addActionListener(e -> {
            if (aField.getText().isEmpty() || bField.getText().isEmpty()) return;
            double a = Double.parseDouble(aField.getText());
            double b = Double.parseDouble(bField.getText());
            addResult.setText("= " + (a + b));
        });

        subBtn.addActionListener(e -> {
            if (aField.getText().isEmpty() || bField.getText().isEmpty()) return;
            double a = Double.parseDouble(aField.getText());
            double b = Double.parseDouble(bField.getText());
            subResult.setText("= " + (a - b));
        });

        mulBtn.addActionListener(e -> {
            if (aField.getText().isEmpty() || bField.getText().isEmpty()) return;
            double a = Double.parseDouble(aField.getText());
            double b = Double.parseDouble(bField.getText());
            mulResult.setText("= " + (a * b));
        });

        divBtn.addActionListener(e -> {
            if (aField.getText().isEmpty() || bField.getText().isEmpty()) return;
            double a = Double.parseDouble(aField.getText());
            double b = Double.parseDouble(bField.getText());
            divResult.setText("= " + (a / b));
        });

        f.setVisible(true);
    }
}