import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
  public static void mainDraw(Graphics graphics) {
    int y = 10;
    int x = 20;
    for (int i = 0; i < 4; i ++){
      Random rand = new Random();
      graphics.setColor(new Color(rand.nextInt(0xFFFFFF)));
      graphics.fillRect(x, y, x, y);
      x = rand.nextInt(100);
      y = rand.nextInt(100);
    }
  }
  static int WIDTH = 320;
  static int HEIGHT = 343;
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}
