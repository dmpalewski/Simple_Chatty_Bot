import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        String res = "Regular";
        if (year % 4 == 0) {
            if (year % 400 == 0 || year % 100 != 0) {
                res = "Leap";
            }
        }
        System.out.println(res);
    }
}