package Part1.Task5;

import java.util.Scanner;

public class Sum {
    public static void result3(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please insert first digit: ");
        int firstDigit= scanner.nextInt();
        System.out.print("Please insert first digit: ");
        int secondDigit= scanner.nextInt();

        if(firstDigit > secondDigit) {
            int tmp = firstDigit;
            firstDigit = secondDigit;
            secondDigit = tmp;
        }

        int result1 = 0;
        for (int i = firstDigit; i<=secondDigit; i++){
            result1+=i;
        }
        System.out.println(result1);

        System.out.print("Please insert mulitiplier: ");
        int multiplier = scanner.nextInt();
        int sum=0;
        for (int i=1; i<multiplier; i++) {
            sum = i * multiplier;
            System.out.println(i + "x" + multiplier + "=" + sum);
        }
    }
}
