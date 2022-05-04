package Part1.Task4;

import java.util.Scanner;

public class Bmi {
    public static void resultBmi(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please insert weight: ");
        float weight = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Please insert height: ");
        int height = scanner.nextInt();
        scanner.nextLine();
        float heightInMeter= height/100f;
        double bmi= (weight)/(Math.pow(heightInMeter, 2));
        System.out.println(heightInMeter);

        if (18.5<bmi && bmi>24.9){
            System.out.println("BMI is correct: "+bmi);
        }else {
            System.out.println("BMI is not correct: "+bmi);
        }
    }
}
