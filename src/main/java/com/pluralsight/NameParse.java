package com.pluralsight;
import java.util.*;


public class NameParse {

    //Using Split

    static String fullName, fname= "", lname = "", midname = "";

    public static void parser(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        fullName = scan.nextLine();

        String[] nameParts = fullName.split("\\s+");

        if(nameParts.length == 1){
            fname = nameParts[0];
        }else if(nameParts.length == 2){
            fname = nameParts[0];
            lname = nameParts[1];
        }else{
            fname = nameParts[0];
            midname = nameParts[1];
            lname = nameParts[2];
        }
        System.out.println("\nFirst name: " + fname);
        System.out.println("Middle name: " + midname);
        System.out.println("Last name: " + lname);

    }



}
