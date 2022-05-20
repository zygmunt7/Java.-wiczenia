package Part1.Task9;

import java.util.Scanner;

public class FizzBuzz {
    public static void gameFizzBuzz(){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Range fram: "+a+" "+b);
        for (int i = a; i<=b; i++){
            System.out.println(i);
            if (i%3==0){
                System.out.println("Fizz");
            }
            if (i%5==0){
                System.out.println("Buzz");
            }
            if (i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
            }
        }

    }
}
