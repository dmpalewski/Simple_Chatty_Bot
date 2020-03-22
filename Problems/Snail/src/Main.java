import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int numDays = 0;
        int distance = 0;
        while (distance <= h) {
            numDays +=1;
            distance += a;
            if (distance >= h) break;
            distance -= b;
        }
        System.out.println(numDays);
        // put your code here
    }
}