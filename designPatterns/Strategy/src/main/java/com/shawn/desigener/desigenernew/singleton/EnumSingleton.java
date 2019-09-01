package com.shawn.desigener.desigenernew.singleton;


public enum  EnumSingleton{

    SHAWN("001","001");

    private String id;
    private String name;

    /**要显示的定义和你枚举类里面要初始化的内容*/
     EnumSingleton(String id,String name){
        this.id=id;
        this.name=name;
    }
    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
