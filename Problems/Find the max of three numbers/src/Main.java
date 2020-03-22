import java.util.Scanner;

public class Main {
    public static int getNumberOfMaxParam(int a, int b, int c) {
        int res = 1;
        if (b > a && b >= c) res = 2;
        if (c > a && c > b) res = 3;
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}
