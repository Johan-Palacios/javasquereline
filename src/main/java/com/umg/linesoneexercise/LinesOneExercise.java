package com.umg.linesoneexercise;

import javax.swing.JFrame;

public class LinesOneExercise {

  public static void main(String[] args) {
    PanelDibujo draw = new PanelDibujo();
    JFrame app = new JFrame();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.add(draw);
    app.setSize(1000,1000);
    app.setVisible(true);
  }
}
