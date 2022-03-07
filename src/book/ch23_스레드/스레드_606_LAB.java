//package book.ch23_스레드;
//
//import javax.imageio.ImageIO;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//
//class GraphicObject {
//    BufferedImage img = null;
//    int x =0, y = 0;
//
//    public GraphicObject(String name){
//        try{
//            img = ImageIO.read(new File(name));
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            System.out.println("파일ㄴ");
//            System.exit(0);
//        }
//    }
//    public void update(){}
//    public void draw(Graphics g){
//        g.drawImage(img, x, y, null);
//    }
//    public void keyPressed(KeyEvent event){}
//}
//
//class Missile extends GraphicObject{
//    boolean launched = false;
//    public Missile(String name){
//        super(name);
//        y = -200;
//    }
//    public void update() {
//        if(launched) y -= 1;
//        if(y <-100) launched = false;
//    }
//    public void keyPressed(KeyEvent event, int x, int y){
//        if (event.getKeyCode() == KeyEvent.VK_SPACE) {
//            launched = true;
//            this.x = x;
//            this.y = y;
//        }
//    }
//}
//
//class Enermy extends GraphicObject{
//    int dx = -10;
//    public Enermy(String name){
//        super(name);
//        x = 500;
//        y = 0;
//    }
//    public void update(){
//        x+= dx;
//        if(x < 0) dx = +10; if(x > 500) dx = -10;
//    }
//}
//
//class SpaceShip extends GraphicObject{
//    public SpaceShip(String name) {
//        super(name);
//        x=150;
//        y=350;
//    }
//    public void keyPressed(KeyEvent event) {
//        if(event.getKeyCode() == KeyEvent.VK_LEFT){ x -= 10;}
//        if(event.getKeyCode() == KeyEvent.VK_RIGHT){ x += 10;}
//        if(event.getKeyCode() == KeyEvent.VK_UP){ y -= 10;}
//        if(event.getKeyCode() == KeyEvent.VK_DOWN){ y -= 10;}
//    }
//}
//
//class MyPanel extends JPanel implements KeyListener {
//    Enermy enermy;
//    SpaceShip spaceShip;
//    Missile missile;
//    public MyPanel() {
//        super();
//        this.addKeyListener(this);
//        this.requestFocus();
//        setFocusable(true);
//        enermy = new Enermy("enermy.png");
//        spaceShip = new SpaceShip("spaceship.png");
//        missile = new Missile("missile.png");
//        class MyThread extends Thread{
//            public void run(){
//                while(true){
//                    enermy.update();
//                    spaceShip.update();
//                    missile.update();
//                    repaint();
//                    try{Thread.sleep(50);}
//                    catch(InterruptedException e) {}
//                }
//            }
//        }
//        Thread t = new Thread();
//        t.start();
//    }
//    public void paint(Graphics g){
//        super.paint(g);
//        enermy.draw(g);
//        spaceShip.draw(g);
//        missile.draw(g);
//    }
//    public void keyPressed(KeyEvent event) {
//        spaceShip.keyPressed(event);
//        missile.keyPressed(event, spaceShip.x, spaceShip.y);
//    }
//    public void keyReleased(KeyEvent arg0) {}
//    public void keyTyped(KeyEvent arg0) {}
//}
//
//public class 스레드_606_LAB  extends JFrame {
//    public 스레드_606_LAB() {
//        setTitle("My Game");
//        add(new MyPanel());
//        setSize(500, 500);
//        setVisible(true);
//    }
//    public static void main(String[] args) {
//        new 스레드_606_LAB();
//    }
//}
