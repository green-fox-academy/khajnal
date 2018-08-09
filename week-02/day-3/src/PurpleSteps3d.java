import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class PurpleSteps3d {
  public static void mainDraw(Graphics graphics) {
    Color mediumOrchid = new Color(186,85,211);
    graphics.setColor(mediumOrchid);
    int startingPoint = 5;
    int cubeSize = 10;
    for (int i = 0; i < 6; i++) {
      graphics.fillRect(startingPoint, startingPoint, cubeSize, cubeSize);
      startingPoint += cubeSize;
      cubeSize += 10;
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
