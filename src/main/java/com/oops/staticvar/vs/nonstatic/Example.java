package com.oops.staticvar.vs.nonstatic;
public class Example {

    public static void main(String[] args) {
        Sample s1 = new Sample();
        System.out.println("s1 = "+s1);//s1.toString()

        Sample s2 = new Sample();
        System.out.println("s2 = "+s2);

        Sample s3 = new Sample();
        System.out.println("s3 = "+s3);
    }
}

class Sample
{
    int nonStaticCountVar = 10;
    static int  staticCountVar = 10;

    public Sample()
    {
        nonStaticCountVar++;
        staticCountVar++;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("nonStaticCountVar = "+nonStaticCountVar);
        sb.append(":: staticCountVar = "+staticCountVar);

        return sb.toString();
    }
}