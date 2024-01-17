import java.util.scanner
//giai phuong trinh bac nhat
public class PhuongTrinhBacNhat {
     public static void main(String[]args) {
        Scanner heSoA = new Scanner(System.in);
        System.out.print("nhập giá trị a:");
        double a= scanner.nextDouble();
        System.out.print("nhập giá trị b:");
        double b=  scanner.nextDouble();
        giaiPhuongTrinhBacNhat(a,b);
        scanner.close();
}
private static void giaiPhuongTrinhBacNhat(double a, double b) {
      if (a == 0) {
           if (b == 0) {
            System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
           }
        }    else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
     }              
}
}