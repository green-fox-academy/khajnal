import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Sierpinsky{

  public static void mainDraw(Graphics graphics){
    int xStartingPoint = WIDTH * 2 / 3;
    int yStartingPoint = HEIGHT * 2 / 3;
    int size = WIDTH / 3;
    drawRectFractal(xStartingPoint, yStartingPoint, size, graphics);
  }

  public static void drawRect (int x, int y, int size, Graphics graphics) {
    Random random = new Random();
    graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
    graphics.fillRect(x, y, size, size);
  }
  
  public static void drawRectFractal (int x, int y, int size, Graphics graphics) {
    drawRect(x, y, size, graphics);
    if (size > 5) {
      drawRectFractal(x - size * 2 / 3, y - size * 2 / 3, size / 3, graphics);
      drawRectFractal( x + size / 3, y - size * 2 / 3, size / 3, graphics);
      drawRectFractal(x + size * 4 / 3, y - size * 2 / 3, size / 3,  graphics);
      drawRectFractal(x + size * 4 / 3, y + size / 3, size / 3,  graphics);
      drawRectFractal(x + size * 4 / 3, y + size * 4 / 3, size / 3,  graphics);
      drawRectFractal(x - size * 2 / 3, y + size * 4 / 3, size / 3,  graphics);
      drawRectFractal(x - size * 2 / 3, y + size / 3, size / 3,  graphics);
      drawRectFractal(x + size / 3, y + size * 4 / 3, size / 3,  graphics);
    }
  }
  //    Don't touch the code below
  static int WIDTH = 500;
  static int HEIGHT = 500;
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
