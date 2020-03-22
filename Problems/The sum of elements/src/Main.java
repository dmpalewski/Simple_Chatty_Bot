import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()) {
            int nextNum = scanner.nextInt();
            if (nextNum == 0) {
                break;
            }
            sum += nextNum;
        }
        System.out.println(sum);
    }
}
