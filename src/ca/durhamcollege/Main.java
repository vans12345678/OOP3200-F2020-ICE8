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
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        System.out.printf("You entered: %s", name);
    }

    public static void main(String[] args)
    {
	    new Main();
    }
}
