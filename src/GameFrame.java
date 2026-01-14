import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        setTitle("Bubble Shooter Game");
        setSize(600, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new GamePanel());
        setVisible(true);
    }
}
