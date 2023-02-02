package com.oops.abstraction.interfaces;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Vechicle obj = new Bus();
        obj.run();
    }
}

abstract class Vechicle
{
    public void run()
    {
        System.out.println("Vechicle is Running");
    }
}


class Bus extends  Vechicle
{
    public void run()
    {
        System.out.println("Bus is Running");
    }
}