package book.re_gui.ch17_sc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheck extends JPanel implements ItemListener {
    JCheckBox[] buttons = new JCheckBox[3];
    String[] fruits = {"apple", "grape", "orange"};
    JLabel[] pictureLabel = new JLabel[3];
    ImageIcon[] icon = new ImageIcon[3];

    public JCheck() {
        super(new GridLayout(0, 4));

        for (int i = 0; i < 3; i++) {
            buttons[i] = new JCheckBox(fruits[i]);
            buttons[i].addItemListener(this);
            pictureLabel[i] = new JLabel(fruits[i] + ".png");
            icon[i] = new ImageIcon(fruits[i] + ".png");
        }
        JPanel checkPanel = new JPanel(new GridLayout(0, 1));
        for (int i = 0; i < 3; i++) {
            checkPanel.add(buttons[i]);

            add(checkPanel);
            add(pictureLabel[0]);
            add(pictureLabel[1]);
            add(pictureLabel[2]);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        ImageIcon image = null;

        Object source = e.getItemSelectable();
        for (int i = 0; i < 3; i++) {
            if (source == buttons[i]) {
                if (e.getStateChange() == ItemEvent.DESELECTED)
                    pictureLabel[i].setIcon(null);
                else pictureLabel[i].setIcon(icon[i]);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBoxDemo");

    }
}
