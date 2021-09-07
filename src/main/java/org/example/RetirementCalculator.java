package org.example;

import java.util.Calendar;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */
public class RetirementCalculator
{
    public static void main( String[] args )

    {
        System.out.print( "What is your current age? " ); //asks user for age
        Scanner input = new Scanner(System.in); //imports scanner
        String age = input.nextLine(); //gets user input
        int iage = Integer.parseInt(age); //converts string to int;

        System.out.print( "At what age would you like to retire? " ); //asks user for retirement age
        String rage = input.nextLine(); //gets user input
        int irage = Integer.parseInt(rage); //converts string to int;

        int yearsleft= irage-iage;
        System.out.print( "You have "+yearsleft+" years left until you can retire."+"\n" );
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int retireyear= year+yearsleft;
        System.out.print( "It's "+year+" so you can retire in "+retireyear+".");


    }
}
