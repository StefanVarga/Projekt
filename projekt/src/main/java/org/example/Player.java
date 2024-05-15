package org.example.logic;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Player extends Entity implements KeyListener {
    public boolean up, down, right, left;
    int move = 3;
    public int health = 3;

    public Player(int x, int y, int width, int height, String file) {
        this.x = x;
        this.y = y;
        this.width = 32;
        this.height = 32;
        setImage(file);
    }

    public void update(ArrayList<Wall> walls) {
        if (up) {
            setImage("steve_up.png");
            y -= move;
            for (Wall wall : walls) {
                if (wall.getRectangle().intersects(getRectangle())) {
                    y += move;
                }

            }
        }
            if (down) {
                setImage("steve_down.png");
                y += move;
                for (Wall wall : walls) {
                    if (wall.getRectangle().intersects(getRectangle())) {
                        y -= move;
                    }
                }
            }
                if (left) {
                    setImage("steve_left.png");
                    x -= move;
                    for (Wall wall : walls) {
                        if (wall.getRectangle().intersects(getRectangle())) {
                            x += move;
                        }
                    }
                }
                if (right) {
                    setImage("steve_right.png");
                    x += move;
                    for (Wall wall : walls) {
                        if (wall.getRectangle().intersects(getRectangle())) {
                            x -= move;
                        }

                    }
                }
                if (x <= 32) {
                    x = 32;
                }
                if (x >= 1050 - width) {
                    x = 1050 - width;
                }
                if (y <= 32) {
                    y = 32;
                }
                if (y >= 470 - height) {
                    y = 470 - height;
            }
    }
    @Override
    public void keyTyped (KeyEvent e){

    }

    @Override
    public void keyPressed (KeyEvent e){
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_W) {
            up = true;
        }
        if (code == KeyEvent.VK_S) {
            down = true;
        }
        if (code == KeyEvent.VK_A) {
            left = true;
        }
        if (code == KeyEvent.VK_D) {
            right = true;
        }
    }

    @Override
    public void keyReleased (KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_W) {
            up = false;
        }
        if (code == KeyEvent.VK_S) {
            down = false;
        }
        if (code == KeyEvent.VK_A) {
            left = false;
        }
        if (code == KeyEvent.VK_D) {
            right = false;
        }
    }
}
