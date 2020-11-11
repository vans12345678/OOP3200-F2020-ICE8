/**
 * Author: Andre Agrippa
 * Date: November 11, 2020
 */


package ca.durhamcollege;

import java.util.Scanner;

public class Main
{

    public Main()
    {
        //define our Scanner
        Scanner keyboard = new Scanner(System.in);

        //Variables
        String name = "";
        float age = 0.0f;

        //Input

        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();




        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();
        System.out.println();

        //Output
        System.out.printf("You entered: %s \n", name);
        System.out.printf("You entered: %.2f\n", age);
    }

    public static void main(String[] args)
    {
	    new Main();
    }
}
