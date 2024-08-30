import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App {
    private JFrame frame;
    private JTextField display;
    private double number1, number2, result;
    private String operation;

    public App() {
        frame = new JFrame("Simple Calculator");
        frame.setSize(200, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        display = new JTextField(16);
        display.setEditable(false);

        JButton[] buttons = new JButton[16];
        String[] buttonLabels = {"7", "8", "9", "/",
                                 "4", "5", "6", "*",
                                 "1", "2", "3", "-",
                                 "0", ".", "=", "+"};

        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(new ButtonListener());
            frame.add(buttons[i]);
        }

        frame.add(display);
        frame.setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("=")) {
                number2 = Double.parseDouble(display.getText());
                switch (operation) {
                    case "+":
                        result = number1 + number2;
                        break;
                    case "-":
                        result = number1 - number2;
                        break;
                    case "*":
                        result = number1 * number2;
                        break;
                    case "/":
                        result = number1 / number2;
                        break;
                }
                display.setText(String.valueOf(result));
            } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
                number1 = Double.parseDouble(display.getText());
                operation = command;
                display.setText("");
            } else {
                display.setText(display.getText() + command);
            }
        }
    }

    public static void main(String[] args) {
        new App();
    }
}