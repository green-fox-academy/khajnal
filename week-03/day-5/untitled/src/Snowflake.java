import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Snowflake{

  public static void mainDraw(Graphics graphics){
    int xStartingPoint = 10;
    int yStartingPoint = 10;
    graphics.translate(WIDTH / 2, HEIGHT);
    drawLine(100, 0, 640, 500);


  }
  public static void drawLine (int lenght, int angle, int x, int y, Graphics graphics) {
    int xsize = (int)(Math.cos(angle) * lenght);
    int ysize = (int)(Math.cos(angle) * lenght);
    graphics.drawLine(x, y, );

  }

  //    Don't touch the code below
  static int WIDTH = 1200;
  static int HEIGHT = 720;
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