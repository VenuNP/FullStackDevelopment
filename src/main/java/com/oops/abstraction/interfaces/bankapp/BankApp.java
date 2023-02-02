package com.oops.abstraction.interfaces.bankapp;

import java.util.Scanner;

interface ATM {
    public abstract int checkBalance();
}


class ICICIServer implements ATM
{
    public int checkBalance()
    {
        System.out.println(" From ICICI ---> ");
        return 1000;
    }
}


class HDFCServer implements ATM
{
    public int checkBalance()
    {
        System.out.println(" From HDFC ---> ");
        return 2000;
    }
}

public class BankApp
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter \n 1. ICICI \n 2. HDFC");
        int card = scanner.nextInt();
        if(card == 1)
        {
            ATM atm = new ICICIServer();
            System.out.print( atm.checkBalance());
        }else  if(card == 2)
        {
            ATM atm = new HDFCServer();
            System.out.println("Balance = "+ atm.checkBalance());
        }else
        {
            System.out.println("Invalid Option");
        }

    }
}