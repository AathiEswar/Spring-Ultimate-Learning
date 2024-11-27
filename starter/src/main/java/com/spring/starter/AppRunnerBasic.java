package com.spring.starter;

import com.spring.starter.game.GameRunner;
import com.spring.starter.game.MarioGame;

public class AppRunnerBasic {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
