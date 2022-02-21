package com.company;

public class Main {

    public static void main(String[] args)
    {
	int costforsummer = 2150;
    int costforfall = 1520;
    int costforwinter = 830;
    int costforspring = 1000;
    System.out.println("The cost for Summer is $"+costforsummer);
    System.out.println("The cost for Fall is $"+costforfall);
    System.out.println("The cost for Winter is $"+costforwinter);
    System.out.println("The cost for Spring is $"+costforspring);
    int yearlycost = costforsummer + costforfall + costforwinter + costforspring;
    System.out.println("The total cost for the year is $"+yearlycost);
    }
}
