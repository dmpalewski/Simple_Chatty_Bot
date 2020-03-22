import java.lang.Math;
import java.util.Scanner;

class Main {
    private static double pi = 3.14;

    public static double findSemiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roomType = scanner.next();
        double a; double b; double c; double r; double area;
        switch (roomType) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double s = findSemiPerimeter(a, b, c);
                area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                area = a * b;
                break;
            case "circle":
                r = scanner.nextDouble();
                area = pi * Math.pow(r, 2);
                break;
            default:
                area = 0.0;
        }
        System.out.println(area);
    }
}