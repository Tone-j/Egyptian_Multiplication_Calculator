package EgyptianMultiplicationCalculator;

import java.io.InputStream;
import java.util.Scanner;

public class Data {

    /**
     *System.in is a standard input stream.
     * This Class is responsible for collecting all the data neeeded by the main Class.
     * it also makes sure that it collect positive integers only and return them.
     */
    private final Scanner inputScanner;

    public Data(){

        this.inputScanner = new Scanner(System.in);
    }

    public Data(InputStream inputStream){

        this.inputScanner = new Scanner(inputStream);
    }

    public int getFirstNumber(){

        System.out.println("Enter first number: ");
        int firstValue = this.inputScanner.nextInt();

        if (firstValue < 1){
            System.out.println("Error: make sure value is positive");
            getFirstNumber();
        }

        return firstValue;
    }

    public int getSecondNumber(){

        System.out.println("Enter second number: ");
        int secondValue = this.inputScanner.nextInt();

        if (secondValue < 1){
            System.out.println("Error: make sure value is positive");
            getSecondNumber();
        }

        return secondValue;
    }

    public int calcController(){

        System.out.println("press 0 to quit and any positive number to continue");
        int contr = this.inputScanner.nextInt();

        return contr;
    }
}
