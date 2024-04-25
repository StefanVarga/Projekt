package org.example;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class KeyHandler implements KeyListener {
    public boolean UP, DOWN, LEFT, RIGHT;
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_W) {
            UP = true;
        }
        if(code == KeyEvent.VK_S) {
            DOWN = true;
        }
        if(code == KeyEvent.VK_A) {
            LEFT = true;
        }
        if(code == KeyEvent.VK_D) {
            RIGHT = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_W) {
            UP = false;
        }
        if(code == KeyEvent.VK_S) {
            DOWN = false;
        }
        if(code == KeyEvent.VK_A) {
            LEFT = false;
        }
        if(code == KeyEvent.VK_D) {
            RIGHT = false;
        }
    }
}
