package EgyptianMultiplicationCalculator;

import java.io.InputStream;
import java.util.Scanner;

public class Data {

    /**
     *System.in is a standard input stream.
     * This Class is responsible for collecting all the data needed by the main Class.
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

        toString("Enter first number: ");
        int firstValue = this.inputScanner.nextInt();

        if (firstValue < 1){
            toString("Error: make sure value is positive");
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

        toString("press 0 to quit and any positive number to continue");
        int contr = this.inputScanner.nextInt();

        return contr;
    }

    public void toString(String massage){
        System.out.println(massage);
    }
}
