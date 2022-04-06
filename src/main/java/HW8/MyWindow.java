package HW8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    private int value;

    public MyWindow(int initialValue) {
        setTitle("MyWindow");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 300, 300);

        Font font = new Font("Arial", Font.BOLD, 28);

        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setBounds(130, 90, 50, 50);
        add(counterValueView);

        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        setLayout(null);

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        decrementButton.setBounds(0,0, 50, 300);
        add(decrementButton);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        incrementButton.setBounds(235,0, 50, 300);
        add(incrementButton);

        JButton nulling = new JButton("Reset");
        nulling.setFont(font);
        nulling.setBounds(50,0, 185, 50);
        add(nulling);

        JButton decrementTen = new JButton("-10");
        decrementTen.setFont(font);
        decrementTen.setBounds(50, 205, 93, 50);
        add(decrementTen);

        JButton incrementTen = new JButton("+10");
        incrementTen.setFont(font);
        incrementTen.setBounds(143, 205, 92, 50);
        add(incrementTen);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });

        nulling.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value = 0;
                counterValueView.setText(String.valueOf(value));
            }
        });

        incrementTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value += 10;
                counterValueView.setText(String.valueOf(value));
            }
        });

        decrementTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value -= 10;
                counterValueView.setText(String.valueOf(value));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow(0);
    }

}
