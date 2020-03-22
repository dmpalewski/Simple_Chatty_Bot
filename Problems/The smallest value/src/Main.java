import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long M = scanner.nextLong();
        long product = 1;
        int n = 1;

        while (product <= M) {
            n++;
            product *= n;
        }
        System.out.println(n);
    }
}
