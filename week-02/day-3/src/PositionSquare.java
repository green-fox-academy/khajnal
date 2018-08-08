import java.util.Random;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {
  public static void  mainDraw(Graphics graphics){
    squareDrawing(graphics);
  }
  public static void squareDrawing(Graphics graphics){
    for (int i = 0; i < 3; i++){
      Random number = new Random();
      int a = number.nextInt(WIDTH - 50);
      int b = number.nextInt(HEIGHT - 50);
      graphics.drawRect(a, b, 50, 50);
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
