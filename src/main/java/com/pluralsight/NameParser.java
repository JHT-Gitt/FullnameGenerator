package com.pluralsight;

import java.util.Scanner;

public class NameParser {

    //Using LastIndex()

    static String firstName = "", middleName = "", lastName = "" , fullName;
    static int firstSpace, secondSpace;

    public static void parser(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        fullName = scan.nextLine();
        firstSpace = fullName.indexOf(" ");
        secondSpace = fullName.lastIndexOf(" ");

        if (firstSpace == -1){
            firstName = fullName;
        }else if (firstSpace == secondSpace){
            firstName = fullName.substring(0, firstSpace);
            lastName = fullName.substring(firstSpace);
        }else{
            firstName = fullName.substring( 0, firstSpace);
            middleName = fullName.substring(firstSpace, secondSpace);
            lastName = fullName.substring(secondSpace);
        }


        System.out.println("\nFirst name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }

}
