package com.company;
import com.company.entity.Motorcycle;
import com.company.entity.MyEngine;
import com.company.entity.EngineType;

public class Main {

    public static void main(String[] args) {
        MyEngine myEngine = new MyEngine("V8", 2.0, 120, EngineType.LPD);
        Motorcycle motorcycle = new Motorcycle("motorcycle","124", myEngine);

        myEngine.start();
        myEngine.stop();
    }
}
