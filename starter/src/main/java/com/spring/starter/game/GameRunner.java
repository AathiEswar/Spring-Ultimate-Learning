package com.spring.starter.game;

public class GameRunner {
    GameConsole game ;
    public GameRunner(GameConsole marioGame) {
        this.game = marioGame;
    }

    public void run() {
        System.out.println("Running the game" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
