import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    int x = 100;
    int y = 500;

    public GamePanel() {
        setBackground(Color.BLACK);

        Timer timer = new Timer(16, e -> {
            y -= 2;        // bubble upar ja rahi hai
            repaint();    // screen refresh
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, 40, 40);
    }
}
