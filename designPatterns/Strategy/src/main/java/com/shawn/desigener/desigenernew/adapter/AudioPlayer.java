package com.shawn.desigener.desigenernew.adapter;

public class AudioPlayer implements MediaPlayer {

    MediaPlayer mediaPlayer;


    @Override
    public void play(String audioType, String fileName) {
        mediaPlayer=new MediaAdapter(audioType);
        mediaPlayer.play(audioType,fileName);
    }
}
