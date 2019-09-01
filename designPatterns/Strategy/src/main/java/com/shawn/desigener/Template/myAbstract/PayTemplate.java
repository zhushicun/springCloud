package com.shawn.desigener.Template.myAbstract;


import java.util.Map;

public abstract class PayTemplate {

    public String callback(){
        Map<String,String> map = Verify();
        if(map!=null){

            return "success";
        }else{

            return resultFail();
        }
    }

    /*
    校验参数
     */
    public abstract Map<String,String> Verify();

    /*
    将失败结果返回
     */
    public abstract String resultFail();
}
