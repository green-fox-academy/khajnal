import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class ColoredBox {
  public static void mainDraw(Graphics rect) {
    // Draw a box that has different colored lines on each edge.
    rect.setColor(Color.green);
    rect.drawLine(10, 10, 10, 200);
    rect.setColor(Color.red);
    rect.drawLine(10, 200, 200, 200);
    rect.setColor(Color.blue);
    rect.drawLine(10, 10, 200, 10);
    rect.setColor(Color.yellow);
    rect.drawLine(200, 10, 200, 200);
  }

  // Don't touch the code below
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