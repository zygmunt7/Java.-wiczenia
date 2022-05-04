package Part1.Task3;

import java.util.Scanner;

public class Equations {
    public static void result(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please insert first digit: ");
        int x= scanner.nextInt();
        System.out.print("Please insert second digit: ");
        int y= scanner.nextInt();
        scanner.nextLine();

        boolean method1= x>y;
        boolean method2=(x*3)>y;
        boolean method3=y++<++x && --x>y++;
        boolean method4=(x*y)%2==0;
        System.out.println(method1);
        System.out.println(method2);
        System.out.println(method3);
        System.out.println(method4);

    }
}
