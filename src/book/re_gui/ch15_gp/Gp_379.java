package book.re_gui.ch15_gp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Gp_379 extends JFrame {

    BufferedImage img = null;

    public Gp_379() {
        setTitle("Image Load");
        try {
            img = ImageIO.read(new File("C:\\Users\\net68\\IdeaProjects\\Book\\src\\book.re_gui\\ch15_gp\\img\\game1.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }

        add(new MyPanel2());
        pack();
        setVisible(true);
    }


    class MyPanel2 extends Component {
        public void paint(Graphics g) {
            g.drawImage(img, 0, 0, null);
        }

        public Dimension getPreferredSize() {
            if (img == null)
                return new Dimension(100, 100);
            else
                return new Dimension(img.getWidth(null), img.getHeight(null));
        }
    }

    public static void main(String[] args) {
        new Gp_379();
    }
}

