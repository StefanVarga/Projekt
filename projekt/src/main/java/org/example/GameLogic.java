package org.example;

import org.example.logic.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class GameLogic {
    public boolean gameOver;
    public Player player;
    public ArrayList<Boss> bosses;
    public ArrayList<Wall> walls;
    public ArrayList<Shot> shots;
    public int level;


    GameLogic() {
        bosses = new ArrayList<>();
        walls = new ArrayList<>();
        shots = new ArrayList<>();
        level = level;
        initialize();

        gameOver = false;
    }
    public void update() {
        player.update(walls);
    }

    private void collision() {

    }
    public void initialize() {
        player = new Player(40, 230, 32, 32, "steve_down.png");

        Boss boss1 = new Boss(980, 215, 64, 64, "pillager.png");
        bosses.add(boss1);
        /*Boss boss2 = new Boss(800, 175, "wither.png");
        bosses.add(boss2);
        Boss boss3 = new Boss(980, 210, "ender_dragon.png");
        bosses.add(boss3);*/
        walls.add(new Wall(223, 32, 32, 155));
        walls.add(new Wall(223, 310, 32, 155));
        walls.add(new Wall(223, 310, 32, 155));
        walls.add(new Wall(318, 32, 32, 30));
        walls.add(new Wall(445, 32, 30, 30));
        walls.add(new Wall(635, 32, 32, 59));
        walls.add(new Wall(762, 94, 32, 91));
        walls.add(new Wall(794, 250, 32, 91));
        walls.add(new Wall(730, 405, 32, 59));
        walls.add(new Wall(635, 219, 32, 123));
        walls.add(new Wall(508, 94, 32, 123));
        walls.add(new Wall(476, 280, 32, 123));
        walls.add(new Wall(350, 155, 32, 185));
        walls.add(new Wall(381, 435, 32, 27));
        walls.add(new Wall(1049, 219, 32, 59));
    }

    public Player getPlayer() {
        return player;
    }

    public ArrayList<Boss> getBosses() {
        return bosses;
    }

    public int getLevel() {
        return level;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public ArrayList<Wall> getWalls() {
        return walls;
    }
}
