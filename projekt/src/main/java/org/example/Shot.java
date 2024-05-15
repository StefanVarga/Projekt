package org.example.logic;

import org.example.GameLogic;

import java.util.ArrayList;
import java.util.Iterator;

public class Shot extends Entity {
    public Shot(int x, int y, int width, int height, String file) {
        this.x = x;
        this.y = y;
        this.width = 32;
        this.height = 32;
        setImage(file);
    }

    public void move() {
        this.x -= 5;
    }
}
