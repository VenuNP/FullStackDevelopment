package com.oops.abstraction.interfaces;

public class FunctionalInterface {
    public static void main(String[] args) {
        SampleThree s3 = ()-> System.out.println("Functional Interface Example");
        SampleFour s4 = (n) ->
        {
            int fact = 1;
           // 5 * 4 * 3 * 2 * 1;

            while(n >=1 )
            {
                fact = fact * n;
                n--;
            }
            return  fact;
        };

        s3.getInfo();
        int fact = s4.findFact(5);
        System.out.println(" 5! = "+fact);
    }
}


interface SampleThree
{
    public abstract void getInfo();
}

interface SampleFour
{
    public abstract int findFact(int n);
}