package com.spring.starter.game;

public class GameRunner {
    GameConsole game ;
    public GameRunner(GameConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running the game" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
