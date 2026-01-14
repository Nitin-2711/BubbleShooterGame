import java.awt.*;

public class Bubble {
    int x, y, radius;
    Color color;

    public Bubble(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.radius = 20;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}
