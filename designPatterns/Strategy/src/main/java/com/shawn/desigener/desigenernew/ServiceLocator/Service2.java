package com.shawn.desigener.desigenernew.ServiceLocator;

public class Service2 implements Service {
   @Override
   public void execute(){
      System.out.println("Executing Service2");
   }
 
   @Override
   public String getName() {
      return "Service2";
   }
}