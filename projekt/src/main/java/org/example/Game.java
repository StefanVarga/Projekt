package org.example;

import java.awt.event.*;

public class Game {
    GameLogic logic;
    GameGraphics graphics;

    public static void main(String[] args) {
        new Game();
    }



    public Game() {
        logic = new GameLogic();
        graphics = new GameGraphics(logic);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    graphics.render(logic);
                    logic.update();

                    try {
                        Thread.sleep(1000 / 60);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
    }
}
