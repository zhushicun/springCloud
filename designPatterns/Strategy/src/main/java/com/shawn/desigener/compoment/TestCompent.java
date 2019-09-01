package com.shawn.desigener.compoment;

import com.shawn.desigener.compoment.myImple.BasicGateAwayCompent;
import com.shawn.desigener.compoment.myImple.LogCompent;

public class TestCompent {
    public static void main(String[] args) {
        LogCompent logCompent = new LogCompent(new BasicGateAwayCompent());
        logCompent.service();
    }
}
