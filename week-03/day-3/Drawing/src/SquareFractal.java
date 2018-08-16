import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareFractal{

  public static void mainDraw(Graphics graphics){
    int size = WIDTH / 3;
    drawSquare(WIDTH / 2 - size / 2,0, size, graphics);
    drawSquare(WIDTH / 2 - size / 2,HEIGHT / 2 + size / 2, size, graphics);
    drawSquare(WIDTH / 2 + size / 2,HEIGHT / 2 - size / 2, size, graphics);
    drawSquare(WIDTH / WIDTH,HEIGHT / 2 - size / 2, size, graphics);
  }
  public static void drawSquare(int x, int y, int size, Graphics graphics) {
    graphics.drawRect(x, y, size, size);
  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;
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