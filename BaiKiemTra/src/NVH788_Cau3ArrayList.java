

import java.util.Scanner;
import java.util.ArrayList;

class NVH788_Cau1Person {
    
    public String name;
    public int age; 
    public double height; 

    
    public NVH788_Cau2Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

  
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void NVH788_Cau2NhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter age: ");
        this.age = scanner.nextInt();

        System.out.print("Enter height: ");
        this.height = scanner.nextDouble();
    }

    
    public void NVH788_Cau2XuatThongTin() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Height: " + this.height);
    }

  
    public static void main(String[] args) {
        Person person = new Person();

        
        person.NVH788_Cau2NhapThongTin();

      
        person.NVH788_Cau2XuatThongTin();
    }
}

