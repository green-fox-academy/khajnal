import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class FunctionToCenter {
  public static void mainDraw(Graphics graphics){
//    drawLine(graphics);
    for (int i = 0; i <= WIDTH; i++) {
      if (i % 20 == 0) {
        graphics.drawLine(i, 0, WIDTH / 2, HEIGHT / 2);
//  not working lines for demo     graphics.drawLine(0, i, WIDTH / 2, HEIGHT / 2);
//  not working lines for demo     graphics.drawLine(WIDTH, i, WIDTH / 2, HEIGHT / 2);
        graphics.drawLine(i, HEIGHT, WIDTH / 2, HEIGHT / 2);
      }
      for (int j = 0; j <= HEIGHT; j++) {
        if (j % 20 == 0) {
          graphics.drawLine(0, j, WIDTH / 2, HEIGHT / 2);
          graphics.drawLine(WIDTH, j, WIDTH / 2, HEIGHT / 2);
        }
      }
    }
  }
  public static void drawLine(Graphics graphics){
    Random number = new Random();
    int a = number.nextInt(WIDTH);
    int b = number.nextInt(HEIGHT);
    graphics.drawLine(a, b, WIDTH / 2, HEIGHT / 2);

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
