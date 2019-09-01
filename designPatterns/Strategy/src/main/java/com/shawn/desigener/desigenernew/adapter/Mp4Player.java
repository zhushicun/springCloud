package com.shawn.desigener.desigenernew.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        /**什么也不做*/
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("MP4。。。");
    }
}
