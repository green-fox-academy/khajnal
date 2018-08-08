import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class LineInTheMiddle {
  public static void mainDraw(Graphics line){
//    draw a red horizontal line to the canvas' middle.
//   draw a green vertical line to the canvas' middle.
    line.setColor(Color.green);
    line.drawLine(HEIGHT / 2 , 0, HEIGHT/2, WIDTH);

    line.setColor(Color.red);
    line.drawLine(0, WIDTH / 2, HEIGHT, WIDTH / 2);
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
