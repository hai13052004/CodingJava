import java.util.Scanner;

public class QuanLySinhVien 
{
    public static void main(String[] args) 
    {
    public String ten;
    public int tuoi;
    public String gioiTinh;
    public String lop;
    public String queQuan;
    public double chieuCao;
    public double canNang;
void nhapTen()
{
    System.out.println("nhap ten cua ban:");
    Scanner sc = new Scanner(System.in);
    String ten = sc.nextLine();
}
void nhapTuoi()
{
    System.out.println("nhap tuoi cua ban:");
    Scanner sc = new Scanner(System.in);
    int tuoi = sc.nextInt();
}
void nhapGioiTinh()
{
    System.out.println("ban la nam hay nu?");
    Scanner sc = new Scanner(System.in);
    String gioiTinhX = sc.nextLine();
    gioiTinh = gioiTinhX.equalsIgnoreCase("nam")? "nam" : "nu";

}
void nhapLop()
{
    System.out.println("nhap lop cua ban:");
    Scanner sc = new Scanner(System.in);
    String lop = sc.nextLine();
}
void nhapQueQuan()
{
    System.out.println("nhap que cua ban:");
    Scanner sc = new Scanner(System.in);
    String queQuan = sc.nextLine();
}
void nhapChieuCao()
{
    System.out.println("nhap chieu cao cua ban(meter):");
    Scanner sc = new Scanner(System.in);
    String chieuCao = sc.nextInt();
}
void nhapCanNang()
{
    System.out.println("nhap can nang cua ban:");
    Scanner sc = new Scanner(System.in);
    String canNang = sc.nextInt();
}
}
}