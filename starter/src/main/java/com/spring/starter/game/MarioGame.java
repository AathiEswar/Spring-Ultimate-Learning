package com.spring.starter.game;

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
