package com.shawn.desigener.desigenernew.factory.simplefactory;

public class SimpleFactory {

    public Student obtainStudent(String student){
        if(student.equals("height")){
            return  new HightStudent();
        }
        if(student.equals("middle")){
            return new MiddleStudent();
        }
        return null;
    }
}
