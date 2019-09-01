package com.shawn.desigener.desigenernew.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/**
* @Description:    被观察者(主体)
* @Author:         hasee
* @CreateDate:     2019/8/20 15:13
* @UpdateUser:     shawn
* @UpdateDate:     2019/8/20 15:13
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Subject {
    List<Observer> list = new ArrayList<>();

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer){
        list.add(observer);
    }

    public void notifyAllObserver(){
        for (Observer observer:
             list) {
            observer.update();
        }
    }

}
