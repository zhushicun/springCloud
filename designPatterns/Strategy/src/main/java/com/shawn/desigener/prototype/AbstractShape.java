package com.shawn.desigener.prototype;
/**
* @Description:    原型模式，用于避免构造器，用于细胞分裂，对于复杂对象直接clone性能高于构造器
* @Author:         hasee
* @CreateDate:     2019/7/21 19:02
* @UpdateUser:     shawn
* @UpdateDate:     2019/7/21 19:02
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public abstract class AbstractShape implements Cloneable{
    private String id;
    protected String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void draw();
    @Override
    protected Object clone() {

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }

    }
}
