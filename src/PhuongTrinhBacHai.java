import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập giá trị b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập giá trị c: ");
        double c = scanner.nextDouble();

        giaiPhuongTrinhBacHai(a, b, c);

        scanner.close();
    }

    private static void giaiPhuongTrinhBacHai(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
