package com.company;
//Need the import to use the Scanner keywords
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // creating the input variables
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to divide: ");
        // creating the number1 variable and assign that variable to allow decimals
        double number1 = input.nextDouble();
        System.out.print("Enter another number to divide: ");
        // creating the number2variable and assign that variable to allow decimals
        double number2 = input.nextDouble();
        double divide;
        // dividing the number
        divide = number1 / number2;
        //condition for checking if the values is divide by zero
        if (number1 == 0) {
            System.out.println("Sorry, you cannot divide by Zero");
        } else {
            System.out.println("The quotient is " + divide);
        }

        // creating the input variables
        Scanner inputAdd = new Scanner(System.in);
        System.out.print("Enter a number to add: ");
        // creating the number1 variable and assign that variable to allow decimals
        int number3 = inputAdd.nextInt();
        System.out.print("Enter another number to add: ");
        // creating the number2variable and assign that variable to allow decimals
        int number4 = inputAdd.nextInt();
        int sum;
        // dividing the number
        sum = number3 + number4;
        //condition for checking if the values is divide by zero
        System.out.println("The quotient is " + sum);


        // creating the input variables
        Scanner inputsum = new Scanner(System.in);
        System.out.print("Enter a number to multiply: ");
        // creating the number1 variable and assign that variable to allow decimals
        int number5 = inputsum.nextInt();
        System.out.print("Enter another number to multiply: ");
        // creating the number2variable and assign that variable to allow decimals
        int number6 = inputAdd.nextInt();
        int product;
        // dividing the number
        product = number5 * number6;
        //condition for checking if the values is divide by zero
        System.out.println("The quotient is " + product);

        System.out.print("Enter a number to subtract:");
        // creating the number1 variable and assign that variable to allow decimals
        int subnum1 = inputsum.nextInt();
        System.out.print("Enter another number to substract: ");
        // creating the number2variable and assign that variable to allow decimals
        int subnum2 = inputAdd.nextInt();
        int difference;
        // dividing the number
        difference = subnum1 - subnum2;
        //condition for checking if the values is divide by zero
        System.out.println("The difference is " + difference);




    }

}