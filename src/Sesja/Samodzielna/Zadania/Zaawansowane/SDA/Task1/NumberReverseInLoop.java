package Sesja.Samodzielna.Zadania.Zaawansowane.SDA.Task1;

import java.util.Scanner;

public class NumberReverseInLoop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String reverse = "";
        System.out.print("Enter your number: ");
        String number = scanner.nextLine();
        int lenght = number.length();
        int i=lenght-1;
        while (i>=0){
            reverse= reverse+number.charAt(i);
            --i;

        }
        System.out.println(reverse);
    }
   /*// public static void main(String[] args) {
        String original, reverse = "";
        System.out.println("Enter the string to be reversed");
        *//* * Used Scanner class to input the String through Console *//*
        Scanner in = new Scanner(System.in);
        original = in.nextLine();
        *//* * Using for loop, iterated through the characters * in reverse order, decrementing the loop by -1 * and concatenating the reversed String * using an inbuilt method charAt() *//*
        int length = original.length();
        for(int i=length-1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println(reverse); }*/
}
