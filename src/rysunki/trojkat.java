package rysunki;

public class trojkat {
    public static void main(String[] args) {
        trojkat(4);
    }

    public static void grupa(int n, char ch) {
        for (int i = 0; i < n; i++)
            System.out.print(ch);
    }

    public static void trojkat(int m) {
        for (int i = 0; i < m; i++) {
            grupa(m-4, ' ');
            grupa(2 * i + 1, '*');
            System.out.println();
        }
    }
}
