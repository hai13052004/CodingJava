import java.util.HashSet;
import java.util.Scanner;

public class hashAdd {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

      
        myHashSet.add("apple");
        myHashSet.add("banana");
        myHashSet.add("cherry");

        System.out.println("Các phần tử trong HashSet ban đầu:");
        System.out.println(myHashSet);

        System.out.print("Nhập phần tử cần thêm: ");
        String newItem = scanner.nextLine();
        myHashSet.add(newItem);

        System.out.println("Các phần tử sau khi thêm " + newItem + ":");
        System.out.println(myHashSet);

        
        System.out.print("Nhập phần tử cần xóa: ");
        String itemToRemove = scanner.nextLine();
        if (myHashSet.contains(itemToRemove)) {
            myHashSet.remove(itemToRemove);
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Phần tử không tồn tại trong HashSet.");
        }

        System.out.println("Các phần tử sau khi xóa " + itemToRemove + ":");
        System.out.println(myHashSet);
    }
}
