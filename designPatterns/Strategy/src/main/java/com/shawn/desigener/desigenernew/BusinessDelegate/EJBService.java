package com.shawn.desigener.desigenernew.BusinessDelegate;

public class EJBService implements BusinessService {
 
   @Override
   public void doProcessing() {
      System.out.println("Processing task by invoking EJB Service");
   }
}