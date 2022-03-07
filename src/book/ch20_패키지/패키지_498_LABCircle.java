package book.ch20_패키지;

import java.awt.*;

public class 패키지_498_LABCircle {
    private int x, y, radius;

    public 패키지_498_LABCircle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw(Graphics g) {
        g.setColor(Color.orange);
        g.fillOval(x - radius, y - radius, x + radius, y + radius);
    }
}
