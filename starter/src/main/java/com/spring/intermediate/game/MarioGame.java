package com.spring.intermediate.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Mario")
public class MarioGame implements GameConsole {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Bend");
    }
    public void left(){
        System.out.println("Move Back");
    }
    public void right(){
        System.out.println("Move Front");
    }
}
