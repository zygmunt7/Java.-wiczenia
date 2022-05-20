package ArraysList;

import java.util.Scanner;

public class MainArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Podaj ilośc elementów tablicy: ");
        int arraysNumber = scanner.nextInt();
        scanner.nextLine();
        int [] arrays =new int[arraysNumber];


        for (int i = 0; i<arrays.length; i++){
            System.out.print("Podaj elementy tablicy: ");
            arrays[i]= scanner.nextInt();
        }

    }
}
