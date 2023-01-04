import java.awt.*;
import javax.swing.*;

/** A component that displays a flower. */
public class Flower extends JPanel {

  /** Program that displays a flower in a window. */
  public static void main(String[] args) {
    JFrame frame = new JFrame("Flower");
    frame.setSize(500, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel flower = new Flower();
    flower.setBackground(Color.blue);

    frame.add(flower);
    frame.setVisible(true);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);  // paint background

    Graphics2D g2 = (Graphics2D) g;


     g2.setColor(new Color(255, 165, 0));  
    g2.fillOval(toScreenX(75), toScreenY(45), toScreenX(50), toScreenY(50));


    int petalWidth = toScreenX(20);
    int petalHeight = toScreenY(20);
    g2.setColor(new Color(255, 192, 203));  
    g2.fillOval(toScreenX(90), toScreenY(35), petalWidth, petalHeight);
    g2.fillOval(toScreenX(90), toScreenY(85), petalWidth, petalHeight);
    g2.fillOval(toScreenX(64), toScreenY(60), petalWidth, petalHeight);
    g2.fillOval(toScreenX(115), toScreenY(60), petalWidth, petalHeight);
    g2.fillOval(toScreenX(108), toScreenY(78), petalWidth, petalHeight);
    g2.fillOval(toScreenX(108), toScreenY(42), petalWidth, petalHeight);
    g2.fillOval(toScreenX(72), toScreenY(78), petalWidth, petalHeight);
    g2.fillOval(toScreenX(72), toScreenY(42), petalWidth, petalHeight);
  }

  /** Converts an x-coordinate from a 200-width screen to the actual width. */
  private int toScreenX(int x) {
    return Math.round(x * getWidth() / 200f);
  }

  /** Converts an y-coordinate from a 200-width screen to the actual width. */
  private int toScreenY(int y) {
    return Math.round(y * getHeight() / 200f);
  }

}