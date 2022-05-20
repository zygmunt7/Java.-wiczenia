package While;

import java.util.Scanner;

public class whileExercise {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        String number= scanner.nextLine();

        int i = 0;
        while (i < 1) {
            System.out.println("Hello World!");
            ++i;
        }
    }
}
