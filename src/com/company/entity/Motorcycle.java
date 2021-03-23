package com.company.entity;

public class Motorcycle extends Machine{
    private String name;
    private String model;
    private Engine engine;
    private int speed;

    public Motorcycle(String name, String model, Engine engine) {
        this.name = name;
        this.model = model;
        this.engine = engine;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Motorcycle run");
    }
}
