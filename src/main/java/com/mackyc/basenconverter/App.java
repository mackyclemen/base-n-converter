package com.mackyc.basenconverter;

/**
 * Hello world!
 */
public final class App {

    public static void main(String[] args) {

        int number, counter;

        while (true)
        try{
            System.console().printf("Enter decimal number: ");
            number = Integer.parseInt(System.console().readLine());
            break;
            } catch (NumberFormatException e) {
            System.console().printf("Invalid input! Try again. ");
        }

        String representation = "";

        // Binary representation converter
        counter = number;
        while(counter != 0) {
            System.out.println(String.format("%d / 2 = %d r %d", counter, counter / 2, counter % 2));
            representation = Integer.toString(counter % 2) + representation;
            counter /= 2;
        }

        System.console().printf("The representation in binary is %s \n", representation);

        // Hex representation converter
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        counter = number;
        representation = "";
        while(counter != 0) {
            System.out.println(String.format("%d / 16 = %d r %d", counter, counter / 16, counter % 16));
            representation = hex[counter % 16] + representation;
            counter /= 16;
        }

        System.console().printf("The representation in hex is %s \n", representation);

        
        // Oct representation converter
        char[] oct = {'0', '1', '2', '3', '4', '5', '6', '7'};
        counter = number;
        representation = "";
        while(counter != 0) {
            System.out.println(String.format("%d / 8 = %d r %d", counter, counter / 8, counter % 8));
            representation = oct[counter % 8] + representation;
            counter /= 8;
        }

        System.console().printf("The representation in oct is %s \n", representation);

    }
}
