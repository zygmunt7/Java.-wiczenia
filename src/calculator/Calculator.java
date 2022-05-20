package calculator;

import java.util.Scanner;

public class Calculator {
    public void calculatorMethod() {
        Scanner scanner = new Scanner(System.in);
        String adding1 = "+";
        String minus1 = "-";
        String multicliplication1 = "*";
        String division1 = "/";

        System.out.print("Wprowadz piwerwsza liczbę: ");
        double firstDigit = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Wprowadz +, -, *, /  ");
        String charOfCalculate = scanner.nextLine();
        System.out.print("Wprowadz drugą liczbe: ");
        double secondDigit = scanner.nextDouble();
        scanner.nextLine();

        int result = 0;

        if (result == adding1.compareTo(charOfCalculate)) {
            System.out.print("Wynik: " + (firstDigit + secondDigit));
        }
        if (result == minus1.compareTo(charOfCalculate)) {
            System.out.print("Wynik: " + (firstDigit - secondDigit));
        }
        if (result == multicliplication1.compareTo(charOfCalculate)) {
            System.out.print("Wynik: " + (firstDigit * secondDigit));
        }
        if (result == division1.compareTo(charOfCalculate)) {
            System.out.print("Wynik: " + (firstDigit / secondDigit));
        }
    }

}
