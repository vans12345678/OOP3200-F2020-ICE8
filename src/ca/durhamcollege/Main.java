/**
 * Author: Andre Agrippa
 * Date: November 11, 2020
 */


package ca.durhamcollege;

import java.util.InputMismatchException;
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
        boolean isValid = false;

        //Input

        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();


        do
        {
            System.out.print("Please enter your age: ");

            try
            {
                age = keyboard.nextFloat();
                isValid = true;

                if((age <= 0.0f) || (age >= 120.0f))
                {
                    System.out.println("Error: You must enter an age greater than 0.0");
                    keyboard.nextLine();
                    isValid = false;
                }
            }
            catch(InputMismatchException e)
            {
                System.out.printf("Error: You must enter a valid-floating point number.\n");
                keyboard.nextLine();
                isValid = false;
            }
        } while(!isValid);

        System.out.println();

        //Output
        System.out.printf("You entered: %s \n", name);
        System.out.printf("You entered: %.2f\n", age);


        //multi-dimensional array example
        System.out.println("Multi-Dimensional Array Example");
        int rows = 8;
        int cols = 8;

        float[][] board = new float[rows][cols];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                board[i][j] = (float)(Math.random()* 100.0f + 1.0f);
            }
        }
        System.out.println("Showing 10 random values");

        for (int i = 0; i < 10 ; i++)
        {
            var randRows = (int)(Math.random() * rows);
            var randCols = (int)(Math.random() * cols);
            System.out.println("For row: " + randRows + " Col: " + randCols + " ");
            System.out.printf("The Random Number is: %.2f", board[randRows][randCols]);
        }

    }




    public static void main(String[] args)
    {
	    new Main();
    }
}
