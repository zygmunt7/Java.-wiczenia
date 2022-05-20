package ArraysList;

import java.util.Scanner;

public class Arrays {
    public static void bubble(int arrays[]) {
        int temp;
        int zmiana = 1;
        while(zmiana > 0){
            zmiana = 0;
            for(int i=0; i<arrays.length-1; i++){
                if(arrays[i]>arrays[i+1]){
                    temp = arrays[i+1];
                    arrays[i+1] = arrays[i];
                    arrays[i] = temp;
                    zmiana++;
                }
            }
        }
        for (int i= 0; i<arrays.length;i++){
            System.out.print(arrays[i] +" ");
        }
    }
}
