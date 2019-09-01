package com.shawn.desigener.desigenernew.NullObject;

/**
* @Description:    在空对象模式（Null Object Pattern）中，
 * 一个空对象取代 NULL 对象实例的检查。Null 对象不是检查空值，
 * 而是反应一个不做任何动作的关系。
 * 这样的 Null 对象也可以在数据不可用的时候提供默认的行为。
* @Author:         hasee
* @CreateDate:     2019/8/20 20:31
* @UpdateUser:     shawn
* @UpdateDate:     2019/8/20 20:31
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class NullPatternDemo {
   public static void main(String[] args) {
 
      AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
      AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
      AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
      AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");
 
      System.out.println("Customers");
      System.out.println(customer1.getName());
      System.out.println(customer2.getName());
      System.out.println(customer3.getName());
      System.out.println(customer4.getName());
   }
}