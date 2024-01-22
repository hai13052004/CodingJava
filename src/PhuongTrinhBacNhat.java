
import java.util.scanner;
//giai phuong trinh bac nhat
public class PhuongTrinhBacNhat {
     public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap he so a:");
        double a = scanner.nextDouble();

        System.out.println("nhap he so b:");
        double b = scanner.nextDouble();

        System.out.println("nhap he so c:");
        double ac = scanner.nextDouble();

        double delta=b*b-4*a*c;

        if(delta>0)
        {
          double x1=(-b+ Math.sqrt(delta))/(2*a);
          double x2=(-b- Math.sqrt(delta))/(2*a);

          System.out.println("phuong trinh co 2 nghiem la x1="+x1+" va x2="+x 2");


        } else if (delta==0) {
          double=-b/(2*a);
          System.out.println("phuong" trinh co nghiem kep x="+x");
          else{
               System.out.println("phuong" trinh vo nghiem");

     
          }
        }


}