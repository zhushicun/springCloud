package com.shawn.desigener.desigenernew.adapter;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if("mp4".equals(audioType)){
            System.out.println("mp4 init");
            advancedMediaPlayer=new Mp4Player();
        }
        if("vlc".equals(audioType)){
            System.out.println("vlc init");
            advancedMediaPlayer=new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if("vlc".equals(audioType)){
            advancedMediaPlayer.playVlc(fileName);
        }
        if("mp4".equals(audioType)){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
