import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    int startX = 300;
    int startY = 600;

    int x = startX;
    int y = startY;

    double dx = 0;
    double dy = 0;

    boolean isShot = false;

    public GamePanel() {
        setBackground(Color.BLACK);

        // Mouse se shoot
        addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                if (!isShot) {
                    double angle = Math.atan2(e.getY() - y, e.getX() - x);
                    dx = Math.cos(angle) * 5;
                    dy = Math.sin(angle) * 5;
                    isShot = true;
                }
            }
        });

        // Game loop
        Timer timer = new Timer(16, e -> {

            if (isShot) {
                x += dx;
                y += dy;

                // Agar bubble screen se bahar chali jaaye
                if (y < 0 || x < 0 || x > getWidth()) {
                    resetBubble();
                }
            }

            repaint();
        });
        timer.start();
    }

    void resetBubble() {
        x = startX;
        y = startY;
        dx = 0;
        dy = 0;
        isShot = false;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, 40, 40);
    }
}
