package com.shawn.desigener.desigenernew.Template;

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("cricket init...");
    }

    @Override
    void startPlay() {
        System.out.println("cricket play game...");
    }

    @Override
    void endPlay() {
        System.out.println("cricket end game...");
    }
}
