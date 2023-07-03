package com.umg.linesoneexercise;

import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int heigth = getHeight();
    int width = getWidth();

    int widthFactor = width / 15;
    int heightFactor = heigth / 15;

    drawPrincipalCorner(0, 0, widthFactor, heightFactor, g);
    drawPrincipalCorner(width, heigth, widthFactor, heightFactor, g);
    drawSecondaryCorner(0, heigth, widthFactor, heightFactor, g);
    drawSecondaryCorner(width, 0, widthFactor, heightFactor, g);
  }

  private void drawPrincipalCorner(int x1, int y1, int wF, int hF, Graphics g) {
    int x2, y2;
    for (int i = 0; i < 15; i++) {
      x2 = wF * i;
      y2 = getHeight() - (hF * i);
      g.drawLine(x1, y1, x2, y2);
    }
  }

  private void drawSecondaryCorner(int x1, int y1, int wF, int hF, Graphics g) {
    int x2, y2;
    for (int i = 0; i < 15; i++) {
      x2 = wF * i;
      y2 = hF * i;
      g.drawLine(x1, y1, x2, y2);
    }
  }
}
