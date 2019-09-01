package com.shawn.desigener.desigenernew.Observer;

/**
* @Description:    观察者
* @Author:         hasee
* @CreateDate:     2019/8/20 15:14
* @UpdateUser:     shawn
* @UpdateDate:     2019/8/20 15:14
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public abstract class Observer {
    public Subject subject;
    public abstract void update();
}
