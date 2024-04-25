package org.example;

import javax.swing.*;
import java.awt.*;


public class Game implements Runnable{
    public static void main(String[] args) {
        new Game();
    }
    private GameGraphics graphics;
    private GameLogic logic;
    Thread gameThread;
    int SET_FPS = 60;

    public Game() {
        this.logic = new GameLogic();
        this.graphics = new GameGraphics(logic);
        gameThread = new Thread(this);
        gameThread.start();
        run();
    }

    public void run() {
        /*double drawInterval = 1000000000/SET_FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;

        while (gameThread != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if(delta >= 1) {
                update();
                repaint();
                delta--;
                drawCount++;
            }
            if (timer >= 1000000000) {
                System.out.println("FPS:" + drawCount);
                drawCount = 0;
                timer = 0;
            }
        }*/
        while(true) {
            long lastFrame = System.nanoTime();
            double timePerFrame = 1000000000 / SET_FPS;

            if (System.nanoTime() - lastFrame == timePerFrame) {
                System.out.println("FPS: "+ timePerFrame);
                update();
            }
        }
    }

    private void update() {
        graphics.render(logic);
        logic.update();
    }

    public GameGraphics getGraphics() {
        return graphics;
    }

    public GameLogic getLogic() {
        return logic;
    }
}
