import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String res = "move ";
        switch (input) {
            case 1:
                res += "up";
                break;
            case 2:
                res += "down";
                break;
            case 3:
                res += "left";
                break;
            case 4:
                res += "right";
                break;
            case 0:
                res = "do not move";
                break;
            default:
                res = "error!";
        }
        System.out.println(res);
    }
}
