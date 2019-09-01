package com.shawn.desigener.desigenernew.builder;

import com.shawn.desigener.desigenernew.factory.abstractfactory.Shape;

/**
* @Description:    建造者模式
* @Author:         hasee
* @CreateDate:     2019/7/20 16:31
* @UpdateUser:     shawn
* @UpdateDate:     2019/7/20 16:31
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface Item {
    public String name();
    public Package packageStyle();
    public String price();
}
