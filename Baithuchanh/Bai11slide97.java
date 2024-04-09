/*Viết chương trình thực hiện các công việc sau:
Nhập liệu cho mảng A có n phần tử nguyên từ bàn phím.
 Sắp xếp mảng số đã nhập tăng dần theo giá trị của các phần tử có trong mảng. 
 In ra màn hình mảng số ban đầu và mảng đã sắp xếp theo thứ tự tăng dần.
 */
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Bai11slide97
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        int n = scanner.nextInt();

        int[] A= new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("nhập giá trị cho phần tử thứ"+(i+1)+"là:");
            A[i]=scanner.nextInt();
        }
        System.out.println("mảng số ban đầu:"+Arrays.toString(A));
        Arrays.sort(A);
        System.out.println("Mảng đã sắp xếp: "+Arrays.toString(A));
        scanner.close();


    }
    
}