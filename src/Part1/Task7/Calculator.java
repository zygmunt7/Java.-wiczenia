package Part1.Task7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculator {
    public static void simpleCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert first digit: ");
        float firstDigit = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Please chose operation [+,-,*,/]: ");
        String operator = scanner.nextLine();

        System.out.print("Please insert second digit: ");
        float secondDigit = scanner.nextFloat();
        scanner.nextLine();



        float result=0;
        switch (operator) {
            case "+":
                result=firstDigit+secondDigit;
                break;
            case "-":
                result=firstDigit-secondDigit;
                break;
            case "*":
                result=firstDigit*secondDigit;
                break;
            case "/":
                result=firstDigit/secondDigit;
                break;

        }

    }
}
