package com.shawn.desigener.desigenernew.Template;

public class Football  extends Game {
    @Override
    void initialize() {
        System.out.println("Football init...");
    }

    @Override
    void startPlay() {
        System.out.println("Football start...");
    }

    @Override
    void endPlay() {
        System.out.println("Football end...");
    }
}
