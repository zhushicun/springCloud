package com.shawn.desigener.desigenernew.Memento;

import java.util.ArrayList;
import java.util.List;

/**
* @Description:    存放历史记录的地方
* @Author:         hasee
* @CreateDate:     2019/8/20 14:33
* @UpdateUser:     shawn
* @UpdateDate:     2019/8/20 14:33
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class CareTaker {
    List<Memento> list = new ArrayList<>();

    public void addMemento(Memento memento){
        list.add(memento);
    }

    public Memento getMenmento(int index){
        return list.get(index);
    }
}
