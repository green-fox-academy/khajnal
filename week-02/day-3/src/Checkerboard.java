import javax.swing.*;
import java.awt.*;

import static java.awt.Color.black;
import static java.awt.Color.white;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    int size = WIDTH / 8;
    int y = 0;
    for (int i = 0; i < 9; i++) {
      int x = 0;
      for (int j = 0; j < 9; j++) {
        if (i % 2 == j % 2) {
          graphics.setColor(Color.WHITE);
          graphics.fillRect(x, y, size, size);
        } else {
          graphics.setColor(Color.BLACK);
          graphics.fillRect(x, y, size, size);
        }
        x += size;
      }
      y += size;
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

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }

}
