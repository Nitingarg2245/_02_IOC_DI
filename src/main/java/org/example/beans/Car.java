package org.example.beans;

public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine=engine;
        System.out.println(" constructor injection triggered");
    }

    public void setEngine(Engine engine){
        this.engine=engine;
        System.out.println("setter injection is triggered");
    }

    public void drive(){
        engine.start();
        System.out.println("car is being driven");
    }
}
