import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int targetSquare = scanner.nextInt();

        String res = "NO";
        if (targetSquare % height == 0) {
            if (targetSquare / height <= width) {
                res = "YES";
            }
        } else if (targetSquare % width == 0) {
            if (targetSquare / width <= height) {
                res = "YES";
            }
        }
        System.out.println(res);
    }
}
