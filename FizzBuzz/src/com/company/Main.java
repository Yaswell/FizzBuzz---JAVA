package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int divisible_By_Five = 5;
        final int divisible_By_Three = 3;
        int test = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        if (number %  divisible_By_Five == 0 && number %  divisible_By_Three == 0 )
            System.out.print("FizzBuzz");
        else if (number %  divisible_By_Five == 0)
            System.out.print("Fizz");
        else if (number %  divisible_By_Three == 0)
            System.out.print("Buzz");
        else
            System.out.print(number);
    }
}
