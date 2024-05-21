import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListmd {
    public static void main(String[] args) {
        
        LinkedList<String> monthList = new LinkedList<>();
        monthList.add("Tháng 1");
        monthList.add("Tháng 2");
        monthList.add("Tháng 3");
        monthList.add("Tháng 4");
        monthList.add("Tháng 5");
        monthList.add("Tháng 6");
        monthList.add("Tháng 7");
        monthList.add("Tháng 8");
        monthList.add("Tháng 9");
        monthList.add("Tháng 10");
        monthList.add("Tháng 11");
        monthList.add("Tháng 12");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số tháng (1-12): ");
        int monthNumber = scanner.nextInt();

        if (monthNumber >= 1 && monthNumber <= 12) {
            String monthName = monthList.get(monthNumber - 1);
            System.out.println("Tháng " + monthNumber + " là " + monthName);

            
            java.time.Month month = java.time.Month.of(monthNumber);
            int daysInMonth = java.time.LocalDate.now().withMonth(monthNumber).lengthOfMonth();
            System.out.println("Số ngày trong tháng " + monthName + " là " + daysInMonth);
        } else {
            System.out.println("Số tháng không hợp lệ. Vui lòng nhập lại từ 1 đến 12.");
        }
    }
}
