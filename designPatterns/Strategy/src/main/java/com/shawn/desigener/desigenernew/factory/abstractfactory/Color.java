package com.shawn.desigener.desigenernew.factory.abstractfactory;

public interface Color {

    //注意事项：
    //1. 接口当中的常量，可以省略public static final，注意：不写也照样是这样。
    //2. 接口当中的常量，必须进行赋值；不能不赋值。
    //3. 接口中常量的名称，使用完全大写的字母，用下划线进行分隔。（推荐命名规则）
    public void getColor();
}
