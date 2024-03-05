//Viết chương trình nhập vào một dãy số gồm n số nguyên từ bàn phím. 
//Tính và in ra màn hình trung bình cộng của n số nguyên đã nhập
import java.util.Scanner;
public class Bai8slide95
{
    public static void main(String[] args) 
    {
        Scanner  scanner = new Scanner(System.in);
      
        System.out.println("ban muon nhap may so?");
        int n = scanner.nextInt();
        System.out.println("nhap day so nguyen");
        int tong = 0;
         for(int i=0;i<n;i++)
         {
            System.out.println("nhap so thu"+ (i+1)+":");
            int soNguyen = scanner.nextInt();
            tong+=soNguyen;

         }
         double trungBinhCong = (double) tong/n;
         System.out.println("tbc cua day so nguyen la"+ trungBinhCong);


    }
}
