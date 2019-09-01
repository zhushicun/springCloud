package com.shawn.desigener.desigenernew.InterceptingFilter;

public class Target {
   public void execute(String request){
      System.out.println("Executing request: " + request);
   }
}