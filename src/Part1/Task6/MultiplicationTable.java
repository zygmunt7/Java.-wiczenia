package Part1.Task6;

import java.util.Scanner;

public class MultiplicationTable {
    public static void table1(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please insert mulitiplier: ");
        int multiplier = scanner.nextInt();
        int sum=0;
        for (int i=1; i<multiplier; i++){
            sum=i*multiplier;
            System.out.println(i+"x"+multiplier+"="+sum);
        }

    }
}
