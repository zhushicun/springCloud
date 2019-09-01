package com.shawn.desigener.adapter.adapterClass;

import com.shawn.desigener.adapter.impl.Mp4Player;
import com.shawn.desigener.adapter.impl.VlcPlayer;
import com.shawn.desigener.adapter.intefter.AdvancedMediaPlayer;
import com.shawn.desigener.adapter.intefter.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
 
   AdvancedMediaPlayer advancedMusicPlayer;
 
   public MediaAdapter(String audioType){
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();
      } else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }  
   }
 
   @Override
   public void play(String audioType, String fileName) {
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}