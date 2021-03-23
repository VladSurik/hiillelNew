package com.company.entity;

public class MyEngine extends Engine{
    private String model;
    private double volume;
    private int power;
    private EngineType enginesType;

    public MyEngine(String model, double volume, int power, com.company.entity.EngineType enginesType) {
        this.model = model;
        this.volume = volume;
        this.power = power;
        this.enginesType = enginesType;
    }


    @Override
    public void start() {
        System.out.println("Start engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop engine");
    }
}
