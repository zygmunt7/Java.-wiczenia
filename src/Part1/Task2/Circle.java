package Part1.Task2;

import java.util.Scanner;

public class Circle {
    public static void circle2(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please insert diamiter: ");
        float diameter = scanner.nextFloat();
        scanner.nextLine();
        double ference = 2*Math.PI*diameter;
        System.out.println("Circumference Of A Circle: "+ference);
        double result = Math.PI*((diameter/2)*(diameter/2));
        System.out.println("Area Of A Circle: "+result);

    }
}
