package com.spring.starter.game;

public class ContraGame implements GameConsole{

    public void up(){
        System.out.println("Move Front");
    }
    public void down(){
        System.out.println("Move Back");
    }
    public void left(){
        System.out.println("Move Left");
    }
    public void right(){
        System.out.println("Move Right");
    }
}
