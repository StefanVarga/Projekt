package org.example.logic;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Entity {
    public int x, y, width, height;
    BufferedImage img;

    public void draw(Graphics g) {
        g.drawImage(img, x, y, width, height, null);
    }
    public void setImage(String file) {
        try {
            img = ImageIO.read(new File("src/main/resources/" + file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Rectangle getRectangle() {
        return new Rectangle(x, y, width, height);
    }
}
