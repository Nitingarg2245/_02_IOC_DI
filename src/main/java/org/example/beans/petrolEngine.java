
package org.example.beans;

public class petrolEngine implements Engine {
   @Override
    public void start() {
       System.out.println("petrol engine started");
    }
    //jaisi hi application context start hoga wo sari bean classes read karke unke object
    // bna dega tab ye chlega just to show how things work internally
    public petrolEngine(){
        System.out.println("petrol engine constructor called ");
    }
}
