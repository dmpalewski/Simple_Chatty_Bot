import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numBridges = scanner.nextInt();
        String res = "Will not crash";
        for (int i=1; i<=numBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                res = "Will crash on bridge " + i;
                break;
            }
        }
        System.out.println(res);

    }
}
