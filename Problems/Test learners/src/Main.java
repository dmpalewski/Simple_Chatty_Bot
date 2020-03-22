import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String res;
        int answer = scanner.nextInt();
        switch (answer) {
            case 1:
                res = "Yes!";
                break;
            case 2:
            case 3:
            case 4:
                res = "No!";
                break;
            default:
                res = "Unknown number";
        }
        System.out.println(res);
    }
}
