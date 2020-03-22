import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ascTrue = true;
        boolean descTrue = true;
        int curNum = scanner.nextInt();

        while (scanner.hasNext()) {
            int nextNum = scanner.nextInt();
            if (nextNum == 0) break;
            if (nextNum < curNum) ascTrue = false;
            if (nextNum > curNum) descTrue = false;
            curNum = nextNum;
        }
        System.out.println(ascTrue || descTrue);
    }
}
