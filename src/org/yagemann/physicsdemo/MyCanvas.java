/*
 * Copyright (c) 2014 Carter Yagemann
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.yagemann.physicsdemo;

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
