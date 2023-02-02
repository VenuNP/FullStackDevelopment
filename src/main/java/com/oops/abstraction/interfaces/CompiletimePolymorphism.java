package com.oops.abstraction.interfaces;

public class CompiletimePolymorphism {
    public static void main(String[] args) {
        Bike obj = new Pulsar();
        obj.run(); // Invokes Subclass method RuntimePolymorphism
        obj.run(2);// Invokes ParentClass Method CompileTimePolymorphism
        obj.run("Petrol");// Invokes ParentClass Method CompileTimePolymorphism
    }
}

abstract class Bike
{
   public void run()
   {
       System.out.println("Bike is Running");
   }

    public void run(String fuel)
    {
        System.out.println("Bike Runs with "+fuel);
    }

    public void run(int wheels)
    {
        System.out.println("Bike Runs with "+wheels+" Wheels");
    }
}


class Pulsar extends  Bike
{
    public void run()
    {
        System.out.println("Pulsar is Running");
    }
}