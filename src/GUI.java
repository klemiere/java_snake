import javax.swing.*;
import java.awt.*;

public class GUI {
    JFrame frame = new JFrame();
    public class GamePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
        }
    }

    public GUI() {
        frame.setTitle("Snake");
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
