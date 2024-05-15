package org.example;

import org.example.logic.Boss;
import org.example.logic.Shot;
import org.example.logic.Wall;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class GameGraphics extends JFrame {
    GameLogic logic;
    BufferedImage background;
    Draw draw;

    GameGraphics(GameLogic logic) throws HeadlessException {

        this.logic = logic;
        this.draw = new Draw();

        setSize(1094, 536);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setFocusable(true);
        requestFocus();
        setTitle("Hra");

        add(draw);
        addKeyListener(logic.getPlayer());

        try {
            background = ImageIO.read(new File("src/main/resources/background1.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void render(GameLogic logic) {
        this.logic = logic;
        repaint();
    }

    public class Draw extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(background, 0, 0, 1080, 500, null);
            logic.player.draw(g);
            for (Boss boss : logic.bosses) {
                boss.draw(g);
            }
        }
    }
}
