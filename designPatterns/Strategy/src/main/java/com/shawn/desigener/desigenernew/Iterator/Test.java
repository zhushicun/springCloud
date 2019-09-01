package com.shawn.desigener.desigenernew.Iterator;

/**
* @Description:   迭代器模式，顺序访问集合对象的元素，不需要知道集合对象的底层表示。属于
 * 行为型模式
 * JAVA 中的 iterator。
* @Author:         hasee
* @CreateDate:     2019/8/20 11:36
* @UpdateUser:     shawn
* @UpdateDate:     2019/8/20 11:36
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Test {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for(Iterator iter = nameRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
