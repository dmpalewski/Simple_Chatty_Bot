import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPeanutsEaten = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean res = (numPeanutsEaten >= 10 && numPeanutsEaten <= 20 && !isWeekend) ||
                (numPeanutsEaten >= 15 && numPeanutsEaten <= 25 && isWeekend);
        System.out.println(res);
    }
}
