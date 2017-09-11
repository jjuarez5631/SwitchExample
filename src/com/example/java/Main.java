package com.example.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Program uses the users input to display 1-10 in a different language
        int userNum = 10;
        String newNumber = "1";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number from 1-10 to be translated: ");
        userNum = input.nextInt();

        switch(userNum){
            case 1: newNumber = "Uno";
                break;
            case 2: newNumber = "Due";
                break;
            case 3: newNumber = "Tre";
                break;
            case 4: newNumber = "Quattro";
                break;
            case 5: newNumber = "Cinque";
                break;
            case 6: newNumber = "Sei";
                break;
            case 7: newNumber = "Sette";
                break;
            case 8: newNumber = "Otto";
                break;
            case 9: newNumber = "Nove";
                break;
            case 10: newNumber = "Dieci";
                break;
            default: newNumber = "Invalid Entry";
        }
        if(userNum >= 1 && userNum <= 10) {
            System.out.println("The number " + userNum + " is " + newNumber + " in Italian.");
        }else {
            System.out.println(newNumber);
        }
    }
}
