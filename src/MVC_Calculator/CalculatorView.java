package MVC_Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField firstOperand = new JTextField(10);
    private JTextField secondOperand = new JTextField(10);
    private JTextField outputField = new JTextField(10);

    private JButton sumButton = new JButton("+");
    private JButton diffButton = new JButton("-");
    private JButton prodButton = new JButton("*");
    private JButton quotButton = new JButton("/");

    public CalculatorView() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        
        panel.add(new JLabel("1|First Number:"));
        panel.add(firstOperand);
        panel.add(new JLabel("2|Second Number:"));
        panel.add(secondOperand);
        panel.add(new JLabel("=|Result:"));
        panel.add(outputField);
        outputField.setEditable(false);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(sumButton);
        buttonsPanel.add(diffButton);
        buttonsPanel.add(prodButton);
        buttonsPanel.add(quotButton);

        this.add(panel, BorderLayout.CENTER);
        this.add(buttonsPanel, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public double getFirstOperand() throws NumberFormatException {
        return Double.parseDouble(firstOperand.getText());
    }

    public double getSecondOperand() throws NumberFormatException {
        return Double.parseDouble(secondOperand.getText());
    }

    public void displayResult(String result) {
        outputField.setText(result);
    }

    public void addOperationHandler(ActionListener listener) {
        sumButton.addActionListener(listener);
        diffButton.addActionListener(listener);
        prodButton.addActionListener(listener);
        quotButton.addActionListener(listener);
    }

    public JButton getSumButton() {
        return sumButton;
    }

    public JButton getDiffButton() {
        return diffButton;
    }

    public JButton getProdButton() {
        return prodButton;
    }

    public JButton getQuotButton() {
        return quotButton;
    }
}

