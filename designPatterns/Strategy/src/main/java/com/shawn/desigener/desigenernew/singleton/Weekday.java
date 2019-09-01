package com.shawn.desigener.desigenernew.singleton;

public enum  Weekday {
    ERROR_REFUSE("REFUSE",1001),
    ERROR_REFUSES("REFUSSE",1002);
    private String message;
    private int code;
    Weekday(String message, int code) {
        this.message = message;
        this.code = code;
    }
    public String getMessage(){
        return message;
    }

    public int getCode(){
        return code;
    }
}
