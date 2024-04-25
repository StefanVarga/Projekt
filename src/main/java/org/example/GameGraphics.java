package org.example;

import javax.swing.*;
import java.awt.*;

public class GameGraphics extends JFrame {
    private GameLogic logic;

    public GameGraphics(GameLogic logic) throws HeadlessException {
        this.logic = logic;
        new Draw();

        setSize(1400, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Game");
    }

    public void render(GameLogic logic) {
        this.logic = logic;
        repaint();
    }

    private class Draw extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
        }
    }
}
