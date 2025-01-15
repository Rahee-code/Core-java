package New1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class ATMSystem {
    private static Map<String, User> users = new HashMap<>();
    private JFrame frame;
    private CardLayout cardLayout;
    private User currentUser; // Store the currently authenticated user
    private JLabel balanceLabel;
    private ATM atm;

    public ATMSystem() {
        initializeUsers();
        setupGUI();
    }

    private void initializeUsers() {
        users.put("user1", new User("user1", "1234", 1000));
        users.put("user2", new User("user2", "5678", 2000));
    }

    private void setupGUI() {
        frame = new JFrame("ATM System");
        cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        mainPanel.add(createLoginPanel(), "Login");
        mainPanel.add(createATMPanel(), "ATM");

        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    private JPanel createLoginPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2));
        JTextField userIdField = new JTextField();
        JPasswordField pinField = new JPasswordField();
        
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userId = userIdField.getText();
                String pin = new String(pinField.getPassword());
                currentUser = authenticateUser(userId, pin);
                if (currentUser != null) {
                    atm = new ATM(currentUser, balanceLabel);
                    cardLayout.show(frame.getContentPane(), "ATM"); // Show the ATM panel
                    updateBalanceLabel();
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid User ID or PIN.");
                }
            }
        });

        panel.add(new JLabel("User ID:"));
        panel.add(userIdField);
        panel.add(new JLabel("PIN:"));
        panel.add(pinField);
        panel.add(loginButton);

        return panel;
    }

    private JPanel createATMPanel() {
        JPanel panel = new JPanel(new GridLayout(5, 1));
        balanceLabel = new JLabel("Current Balance: ");
        JButton checkBalanceButton = new JButton("Check Balance");
        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");
        JButton transferButton = new JButton("Transfer");
        JButton exitButton = new JButton("Exit");

        checkBalanceButton.addActionListener(e -> updateBalanceLabel());

        depositButton.addActionListener(e -> {
            String amountStr = JOptionPane.showInputDialog(frame, "Enter amount to deposit:");
            if (amountStr != null) {
                try {
                    double amount = Double.parseDouble(amountStr);
                    atm.deposit(amount);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid amount.");
                }
            }
        });

        withdrawButton.addActionListener(e -> {
            String amountStr = JOptionPane.showInputDialog(frame, "Enter amount to withdraw:");
            if (amountStr != null) {
                try {
                    double amount = Double.parseDouble(amountStr);
                    atm.withdraw(amount);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid amount.");
                }
            }
        });

        transferButton.addActionListener(e -> {
            String recipientId = JOptionPane.showInputDialog(frame, "Enter recipient User ID:");
            String amountStr = JOptionPane.showInputDialog(frame, "Enter amount to transfer:");
            if (recipientId != null && amountStr != null) {
                try {
                    double amount = Double.parseDouble(amountStr);
                    atm.transfer(recipientId, amount);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid amount.");
                }
            }
        });

        exitButton.addActionListener(e -> {
            frame.dispose();
        });

        panel.add(balanceLabel);
        panel.add(checkBalanceButton);
        panel.add(depositButton);
        panel.add(withdrawButton);
        panel.add(transferButton);
        panel.add(exitButton);

        return panel;
    }

    private void updateBalanceLabel() {
        balanceLabel.setText("Current Balance: " + currentUser.getAccount().getBalance());
    }

    private User authenticateUser(String userId, String pin) {
        User user = users.get(userId);
        return user != null && user.getPin().equals(pin) ? user : null;
    }

    public static User getUserById(String userId) {
        return users.get(userId);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ATMSystem::new);
    }
}
