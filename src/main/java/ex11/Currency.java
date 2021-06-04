package ex11;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Scanner;

public class Currency {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Currency app = new Currency();
        double euros = app.euroInput();
        double rate = app.exchangeRate();
        double dollars = app.conversion(euros, rate);
        app.printOutput(euros, rate, dollars);
    }

    public double euroInput(){
        System.out.print("How many euros are you exchanging? ");
        return input.nextDouble();
    }

    public double exchangeRate(){
        System.out.print("What is the exchange rate? ");
        return input.nextDouble();
    }

    public double conversion(double euros, double rate){
        return euros * rate;
    }

    public void printOutput(double euros, double rate, double dollars){
        System.out.printf("%.2f euros at an exchange rate of %.4f is\n%.2f U.S. dollars.", euros, rate, dollars);
    }
}
