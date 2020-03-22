import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = scanner.nextInt();
        int sum = 0;

        for (int i=0; i<totalNumbers; i++) {
            int nextNum = scanner.nextInt();
            if (nextNum % 6 == 0) {
                sum += nextNum;
            }
        }
        System.out.println(sum);
    }
}
