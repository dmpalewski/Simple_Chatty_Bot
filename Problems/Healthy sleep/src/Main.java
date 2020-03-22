import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lo = scanner.nextInt();
        int hi = scanner.nextInt();
        int actual = scanner.nextInt();

        if (actual < lo) {
            System.out.println("Deficiency");
        } else if (actual > hi) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}