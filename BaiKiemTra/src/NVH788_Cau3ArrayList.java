

import java.util.Scanner;
import java.util.ArrayList;

class NVH788_Cau1Person {
    
    public String name;
    public int age; 
    public double height; 

    
    public NVH788_Cau1Person(String name, int age, double height) {
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
        NVH788_Cau1Person person = new NVH788_Cau1Person();

        
        person.NVH788_Cau2NhapThongTin();

      
        person.NVH788_Cau2XuatThongTin();
    }
}

    public static void addPerson(ArrayList<NVH788_Cau1Person> personList) {
        NVH788_Cau1Person person = new NVH788_Cau1Person();
        person.NVH788_Cau2NhapThongTin();
        personList.add(person);
        System.out.println("Added new person.");
    }

    public static void editPerson(ArrayList<NVH788_Cau1Person> personList, int index) {
        if (index >= 0 && index < personList.size()) {
            NVH788_Cau1Person person = personList.get(index);
            person.NVH788_Cau2NhapThongTin();
            System.out.println("Edited person at index " + index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void deletePerson(ArrayList<NVH788_Cau1Person> personList, int index) {
        if (index >= 0 && index < personList.size()) {
            personList.remove(index);
            System.out.println("Deleted person at index " + index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void NVH788_Cau2XuatThongTinAll(ArrayList<Person> personList) {
        for (int i = 0; i < personList.size(); i++) {
            System.out.println("Person " + (i + 1) + ":");
            personList.get(i).NVH788_Cau2XuatThongTin();
        }
    }
