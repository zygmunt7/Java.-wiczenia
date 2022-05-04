package rysunki;

public class ChristmasTree {
    public static void main(String[] args) {
        grupa(4, '#');
    }

    public static void grupa(int n, char ch) {
        for (int i = 0; i < n; i++)
            System.out.print(ch);
    }

    public static void trojkat(int m) {
        for (int i = 0; i < m; i++) {
            grupa(m - i - 1, ' ');
            grupa(2 * i + 1, '*');
            System.out.println();
        }
    }

}
