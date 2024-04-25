package org.example;

import java.awt.*;


public class Game implements Runnable{

    private GameGraphics graphics;
    private GameLogic logic;
    private final int SET_FPS = 120;


    public Game() {
        this.logic = new GameLogic();
        this.graphics = new GameGraphics(logic);

        run();
    }

    public void run() {
        while(true) {
            long lastFrame = System.nanoTime();
            long timePerFrame = 1000000000 / SET_FPS;

            if (System.nanoTime() - lastFrame == timePerFrame) {
                update();
            }
        }
    }

    private void update() {
        graphics.update(logic);
        logic.update();
    }

    public static void main(String[] args) {
        new Game();
    }

    public GameGraphics getGraphics() {
        return graphics;
    }

    public GameLogic getLogic() {
        return logic;
    }
}
