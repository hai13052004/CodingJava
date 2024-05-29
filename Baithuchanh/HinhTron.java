import java.util.Scanner;
public class HinhTron
{
    public final float PI = 3.14f;
    public float banKinh;
    public float chuVi;
    public float dienTich;

    void nhapBanKinh()
    {
        System.out.print("nhap ban kinh:");
        Scanner sc = new Scanner(System.in);
        float  banKinh = sc.nextFloat();
    }
    void tinhChuVi()
    {
        chuVi = 2*PI*banKinh;

    }
    void tinhDienTich()
    {
        dienTich = PI*banKinh*banKinh;
    }
    void inThongTin()
    {
        System.out.println("chu vi hinh tron:"+ chuVi);
        System.out.println("dien tich hinh tron:"+ dienTich);
    }
}   
endl
