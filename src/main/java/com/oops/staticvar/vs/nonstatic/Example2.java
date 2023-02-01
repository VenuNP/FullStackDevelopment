package com.oops.staticvar.vs.nonstatic;

public class Example2 {
    public static void main(String[] args) {

        System.out.println("staticCountVar =" +Sample2.getStaticCountVar());
    }
}


class Sample2
{
    int nonStaticCountVar ;
    private static int  staticCountVar;
    static
    {
        System.out.println(" Static --Block");
        staticCountVar=10;
    }
    public Sample2()
    {
        nonStaticCountVar=10;

    }
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("nonStaticCountVar = "+nonStaticCountVar);
        sb.append(":: staticCountVar = "+staticCountVar);

        return sb.toString();
    }

    public static int getStaticCountVar()
    {
        return staticCountVar;
    }
}