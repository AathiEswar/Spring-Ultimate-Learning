package com.spring.dependencyInjection.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// asks spring to auto create objects for us
@Component
@Qualifier("Pacman")
public class PacmanGame implements GameConsole {
    public void up(){
        System.out.println("Up");
    }
    public void down(){
        System.out.println("Down");
    }
    public void left(){
        System.out.println("Left");
    }
    public void right(){
        System.out.println("Right");
    }
}
