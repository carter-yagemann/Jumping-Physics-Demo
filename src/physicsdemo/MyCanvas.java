// TODO add template

package physicsdemo;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * 274x400
 * @author Carter Yagemann
 */
public class MyCanvas extends JPanel {
    
    private final int Y_OFFSET = 380;
    private final int X_OFFSET = 250;
    
    private int xPos = 125;
    private int yPos = Y_OFFSET;

    public void setY(int y) {
        yPos = Y_OFFSET - y;
        this.repaint();
    }
    
    public void moveLeft() {
        xPos--;
        if (xPos < 0) xPos = 0;
        this.repaint();
    }
    
    public void moveRight() {
        xPos++;
        if (xPos > X_OFFSET) xPos = X_OFFSET;
        this.repaint();
    }
    
    @Override
    public void paintComponent(Graphics g) {
      super.paintComponent(g);

      g.drawRect (xPos, yPos, 20, 20);
      g.drawLine(0, 400, 273, 400);
      g.drawLine(271, 400, 271, 0);
    }
}
