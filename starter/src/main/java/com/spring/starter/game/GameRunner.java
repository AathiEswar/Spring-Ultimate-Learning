package com.spring.starter.game;

public class GameRunner {
    MarioGame game ;
    public GameRunner(MarioGame marioGame) {
        this.game = marioGame;
    }

    public void run() {
        System.out.println("Running the game" + game);
    }
}
