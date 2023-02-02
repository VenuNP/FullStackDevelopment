package com.oops.abstraction.interfaces;

public class AbstractClassEx {
    public static void main(String[] args) {
        SampleOne obj = new SampleOneImpl();
        obj.getInfo();
    }
}

abstract class SampleOne
{
    public abstract void getInfo();
}

class SampleOneImpl extends SampleOne
{
    public void getInfo()
    {
        System.out.println("SampleImple :: getInfo");
    }
}