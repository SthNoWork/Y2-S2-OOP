package ex4;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Setting");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 450);
        frame.setLocationRelativeTo(null);

        CardLayout cardLayout = new CardLayout();
        JPanel container = new JPanel(cardLayout);

        // ── Screen 1: Setting ──
        JPanel settingPanel = new JPanel(new GridLayout(0, 1, 0, 5));
        settingPanel.setBorder(BorderFactory.createTitledBorder("Setting"));

        String[] settingItems = {"1. General", "2. Wi-Fi", "3. Bluetooth", "4. Mobile Data", "5. Hotsopt", "6. Notification", "Quit"};
        for (String item : settingItems) {
            JButton btn = new JButton(item);
            btn.setHorizontalAlignment(SwingConstants.LEFT);
            if (item.equals("1. General")) btn.addActionListener(e -> cardLayout.show(container, "general"));
            if (item.equals("Quit"))       btn.addActionListener(e -> System.exit(0));
            settingPanel.add(btn);
        }

        // ── Screen 2: Setting > General ──
        JPanel generalPanel = new JPanel(new GridLayout(0, 1, 5, 5));
        generalPanel.setBorder(BorderFactory.createTitledBorder("Setting > General"));

        String[] generalItems = {"1. About", "2. Software update", "3. Storage", "Back"};
        for (String item : generalItems) {
            JButton btn = new JButton(item);
            btn.setHorizontalAlignment(SwingConstants.LEFT);
            if (item.equals("1. About")) btn.addActionListener(e -> cardLayout.show(container, "about"));
            if (item.equals("Back"))     btn.addActionListener(e -> cardLayout.show(container, "setting"));
            generalPanel.add(btn);
        }

        // ── Screen 3: Setting > General > About ──
        JPanel aboutPanel = new JPanel(new BorderLayout(5, 5));
        aboutPanel.setBorder(BorderFactory.createTitledBorder("Setting > General > About"));

        JPanel infoPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        String[][] info = {{"Name", "iPhone"}, {"Model", "IXs"}, {"Version", "18.5"}};
        for (String[] row : info) {
            infoPanel.add(new JLabel(row[0]));
            infoPanel.add(new JLabel(row[1]));
        }

        JButton backAbout = new JButton("Back");
        backAbout.setHorizontalAlignment(SwingConstants.LEFT);
        backAbout.addActionListener(e -> cardLayout.show(container, "general"));

        aboutPanel.add(infoPanel, BorderLayout.NORTH);
        aboutPanel.add(backAbout, BorderLayout.SOUTH);

        container.add(settingPanel, "setting");
        container.add(generalPanel, "general");
        container.add(aboutPanel,   "about");

        cardLayout.show(container, "setting");

        frame.add(container);
        frame.setVisible(true);
    }
}