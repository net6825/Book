package book.re_gui.ch16_el;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame3 extends JFrame implements ActionListener {

    JButton clear, div, multi, minus, plus, change, result;


    JButton[] buttons = new JButton[10];
    JTextField res;

    JButton[] func = new JButton[6];

    String num2 = "";
    String num3 = "";


    public MyFrame3() {
        setTitle("계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);

        JPanel R = new JPanel();
        JPanel C = new JPanel();
        JPanel B = new JPanel();
        JPanel A = new JPanel();

        res = new JTextField(15);
        res.setEnabled(false);
        clear = new JButton("C");
        clear.addActionListener(this);

        div = new JButton("/");
        div.addActionListener(this);
        multi = new JButton("*");
        multi.addActionListener(this);
        minus = new JButton("-");
        minus.addActionListener(this);
        plus = new JButton("+");
        plus.addActionListener(this);
        result = new JButton("=");
        result.addActionListener(this);
        change = new JButton("+/-");
        change.addActionListener(this);

        func[0] = div;
        func[1] = multi;
        func[2] = minus;
        func[3] = plus;
        func[4] = result;
        func[5] = change;

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(Integer.toString(i));
            buttons[i].addActionListener(this);
        }


        GridLayout gridLayout = new GridLayout(4, 4);
        B.setLayout(gridLayout);

        R.add(res);

        C.add(clear);

        B.add(buttons[7]);
        B.add(buttons[8]);
        B.add(buttons[9]);
        B.add(div);
        B.add(buttons[4]);
        B.add(buttons[5]);
        B.add(buttons[6]);
        B.add(multi);
        B.add(buttons[1]);
        B.add(buttons[2]);
        B.add(buttons[3]);
        B.add(minus);
        B.add(buttons[0]);
        B.add(change);
        B.add(result);
        B.add(plus);


        A.add(R);
        A.add(C);
        A.add(B);
        add(A);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String num1, func1;
        int result;

        num1 = e.getActionCommand();

        if (num1.equals("/")) {
            num3 = num2;
            num2 = "";
            func1 = "/";
            res.setText("");
        } else if (num1.equals("*")) {
            num3 = num2;
            num2 = "";
            func1 = "*";
            res.setText("");
        } else if (num1.equals("-")) {
            if (num3 == "") {
                num3 = num2;
                num2 = "";
                func1 = "-";
                res.setText("");
            } else if (num3 != "") {
                result = Integer.parseInt(num3) - Integer.parseInt(num2);
                res.setText(String.valueOf(result));
                num2 = String.valueOf(result);
            }
        } else if (num1.equals("+")) {
            if (num3 == "") {
                num3 = num2;
                num2 = "";
            } else if (num3 != "") {
                result = Integer.parseInt(num3) + Integer.parseInt(num2);
                res.setText(String.valueOf(result));
                num2 = String.valueOf(result);
                System.out.println(result);
            }
        } else if (num1.equals("=")) {
            System.out.println("A");
            switch ("func1") {
                case "+":
                    res.setText(String.valueOf(this.result));
                    num2 = "";
                    num3 = "";
            }
        } else if (num1.equals("+/-")) {
            int a = -1 * Integer.parseInt(num2);
            res.setText(String.valueOf(a));
            num2 = Integer.toString(a);
        } else if (num1.equals("C")) {
            res.setText("");
            num2 = "";
            num3 = "";
            num1 = "";
        } else if (num2 != "") {
            num2 += num1;
        } else if (num2 == "") {
            num2 = num1;
        }

        res.setText(num2);

    }
}

public class El_P3 {
    public static void main(String[] args) {
        new MyFrame3();
    }
}