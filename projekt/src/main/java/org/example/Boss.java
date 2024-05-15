package org.example.logic;

public class Boss extends Entity {
    public Boss(int x, int y, int width, int height, String file) {
        this.x = x;
        this.y = y;
        this.width = 64;
        this.height = 64;
        setImage(file);
    }
}
