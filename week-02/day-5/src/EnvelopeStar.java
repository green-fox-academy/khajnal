import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {
    int nullX = WIDTH / 2;
    int nullY = HEIGHT / 2;
    int increment = WIDTH / 2;
    int decrement = HEIGHT / 2;
    int b = HEIGHT;

    for (int i = 0; i < WIDTH / 2; i += 10) {
      graphics.drawLine(i, nullY, nullX, decrement);
      graphics.drawLine(i, nullY, nullX, increment);
      graphics.drawLine(nullX, i, increment, nullY);
      graphics.drawLine(nullX, b, increment, nullY);
      decrement -= 10;
      increment += 10;
      b -= 10;
    }
    graphics.drawLine(nullX, 0, nullX, HEIGHT);


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
