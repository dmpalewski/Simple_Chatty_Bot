import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int res = input + 2 - input % 2;
        System.out.println(res);
    }
}
