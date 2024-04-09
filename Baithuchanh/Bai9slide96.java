//Bài 9: (string)
//Viết chương trình nhập vào một chuỗi bất kỳ bao gồm cả số, ký tự thường và ký tự hoa từ bàn phím. Sau đó đếm và in ra số ký tự thường và ký tự hoa và số có trong chuỗi đó.

import java.util.Scanner;
public class Bai9slide96
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi ky tu bat ky");
        String input = scanner.nextLine();

        int chuCai = 0, so = 0, kyTuHoa = 0;
        for (int i=0;i<input.length();i++)
        {
            char kyTu = input.charAt(i);
            if (Character.isLetter(kyTu))
            {
                chuCai++;
                if (Character.isUpperCase(kyTu)) {
                    kyTuHoa++;

                }

            }
            else if (Character.isDigit(kyTu)) {
                so++;
                
            }
        }
        System.out.println("so luong chu cai:"+chuCai);
        System.out.println("so luong chu hoa:"+kyTuHoa);
        System.out.println("so luong chu so:"+so);
        scanner.close();
}
}