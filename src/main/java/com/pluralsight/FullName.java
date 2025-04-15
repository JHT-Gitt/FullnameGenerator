package com.pluralsight;
import java.util.*;


public class FullName {


    static String firstName = "", middleName = "", lastName = "" , suffix = "";

    public static void nameGenerator(){

        Scanner scan = new Scanner(System.in);

        System.out.println("\nPlease enter your name ");
        System.out.printf("\nFirst Name: ");
        firstName = scan.nextLine();
        System.out.printf("Middle Name: ");
        middleName = scan.nextLine();
        System.out.printf("Last Name: ");
        lastName = scan.nextLine();
        System.out.printf("Suffix; ");
        suffix = scan.nextLine();
        System.out.printf("\nFull name: %s %s %s %s", firstName, middleName, lastName, suffix);






    }






}
