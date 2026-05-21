package ex5;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Main {

    // Helper: builds a label stacked above a text field as one unit
    private static JPanel fieldPanel(String labelText, JTextField field) {
        JPanel panel = new JPanel(new BorderLayout(0, 2));
        JLabel label = new JLabel(labelText);
        label.setFont(label.getFont().deriveFont(Font.PLAIN, 12f));
        panel.add(label, BorderLayout.NORTH);
        panel.add(field, BorderLayout.CENTER);
        return panel;
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 450);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout(5, 5));
        mainPanel.setBorder(BorderFactory.createTitledBorder("Student Management"));

        // ── Fields ──
        JTextField txtFirst = new JTextField();
        JTextField txtLast  = new JTextField();
        JTextField txtAge   = new JTextField();
        JTextField txtMajor = new JTextField();

        // ── Input panel (NORTH): paired label+field units in a grid ──
        JPanel inputPanel = new JPanel(new GridLayout(1, 4, 8, 0));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        inputPanel.add(fieldPanel("First name", txtFirst));
        inputPanel.add(fieldPanel("Last name",  txtLast));
        inputPanel.add(fieldPanel("Age",        txtAge));
        inputPanel.add(fieldPanel("Major",      txtMajor));

        // ── Button panel (below inputs) ──
        JButton btnAdd    = new JButton("Add New");
        JButton btnEdit   = new JButton("Edit");
        JButton btnDelete = new JButton("Delete");
        JButton btnClear  = new JButton("Clear");
        JButton btnSearch = new JButton("Search");

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 6, 4));
        btnPanel.add(btnAdd);
        btnPanel.add(btnEdit);
        btnPanel.add(btnDelete);
        btnPanel.add(btnClear);
        btnPanel.add(btnSearch);

        // ── Wrap inputs + buttons in NORTH ──
        JPanel northPanel = new JPanel(new BorderLayout(0, 4));
        northPanel.add(inputPanel, BorderLayout.CENTER);
        northPanel.add(btnPanel,   BorderLayout.SOUTH);

        // ── Table ──
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("First name");
        model.addColumn("Last name");
        model.addColumn("Age");
        model.addColumn("Major");

        JTable table = new JTable(model);
        model.addRow(new Object[]{"AA", "Tola",   "21", "IT"});
        model.addRow(new Object[]{"AA", "Makara", "19", "IT"});

        // ── Button logic ──
        btnAdd.addActionListener(e -> {
            String first = txtFirst.getText().trim();
            String last  = txtLast.getText().trim();
            String age   = txtAge.getText().trim();
            String major = txtMajor.getText().trim();
            if (!first.isEmpty() || !last.isEmpty()) {
                model.addRow(new Object[]{first, last, age, major});
                txtFirst.setText(""); txtLast.setText("");
                txtAge.setText("");   txtMajor.setText("");
                txtFirst.requestFocus();
            }
        });

        btnClear.addActionListener(e -> {
            txtFirst.setText(""); txtLast.setText("");
            txtAge.setText("");   txtMajor.setText("");
            txtFirst.requestFocus();
        });

        btnDelete.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row != -1) model.removeRow(row);
        });

        btnEdit.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row != -1) {
                txtFirst.setText((String) model.getValueAt(row, 0));
                txtLast.setText ((String) model.getValueAt(row, 1));
                txtAge.setText  ((String) model.getValueAt(row, 2));
                txtMajor.setText((String) model.getValueAt(row, 3));
                model.removeRow(row);
                txtFirst.requestFocus();
            }
        });

        btnSearch.addActionListener(e -> {
            String query = txtFirst.getText().trim().toLowerCase();
            for (int i = 0; i < model.getRowCount(); i++) {
                String name = model.getValueAt(i, 0).toString().toLowerCase();
                if (name.contains(query)) {
                    table.setRowSelectionInterval(i, i);
                    table.scrollRectToVisible(table.getCellRect(i, 0, true));
                    break;
                }
            }
        });

        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(new JScrollPane(table), BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}