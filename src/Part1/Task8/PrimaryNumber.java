package Part1.Task8;

public class PrimaryNumber {
    public static void primary(){
        int x=0;
        int y=75;
        for (int i=x; i<=y; i++){
            if ((i==2||i==3||i==5||i==7)||(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0)){
                System.out.println(i);
            }
        }
    }
}
