//Bài 6: (do –while)
//Viết chương trình nhập vào 1 số nguyên dương bất kỳ từ bàn phím. Sau đó tính và in ra giai thừa của số đó.
import java.util.Scanner;
public class bai6slide95 {
    public static void main(String[]args)
    {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap so can tinh giai thua:");
    int n= scanner.nextInt();

    if(n<0)
    {
        System.out.println("khong the tinh giai thua");
    }
    else 
        {
            int giaiThua=1;
            int i=1;

            do
            {giaiThua *=1;i++;}
            while(i<=n);
            System.out.println("giai thua cua "+n+" la: "+giaiThua);
        }  
    }
}