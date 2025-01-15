package New1;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ATM {
    private User user;
    private JLabel balanceLabel;

    public ATM(User user, JLabel balanceLabel) {
        this.user = user;
        this.balanceLabel = balanceLabel;
    }

    public void withdraw(double amount) {
        if (user.getAccount().withdraw(amount)) {
            user.addTransaction(new Transaction("Withdraw", amount));
            updateBalance();
            JOptionPane.showMessageDialog(null, "Withdrawal successful! New balance: " + user.getAccount().getBalance());
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient balance.");
        }
    }

    public void deposit(double amount) {
        user.getAccount().deposit(amount);
        user.addTransaction(new Transaction("Deposit", amount));
        updateBalance();
        JOptionPane.showMessageDialog(null, "Deposit successful! New balance: " + user.getAccount().getBalance());
    }

    public void transfer(String recipientId, double amount) {
        User recipient = ATMSystem.getUserById(recipientId);
        if (recipient != null) {
            if (user.getAccount().withdraw(amount)) {
                recipient.getAccount().deposit(amount);
                user.addTransaction(new Transaction("Transfer to " + recipientId, amount));
                recipient.addTransaction(new Transaction("Transfer from " + user.getUserId(), amount));
                updateBalance();
                JOptionPane.showMessageDialog(null, "Transfer successful! New balance: " + user.getAccount().getBalance());
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient balance for the transfer.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Recipient User ID not found.");
        }
    }

    public List<Transaction> getTransactionHistory() {
        return user.getTransactionHistory();
    }

    private void updateBalance() {
        balanceLabel.setText("Current Balance: " + user.getAccount().getBalance());
    }
}
