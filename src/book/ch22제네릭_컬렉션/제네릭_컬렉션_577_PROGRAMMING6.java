package book.ch22제네릭_컬렉션;

import java.util.ArrayList;
import java.util.Scanner;

class Student2 {
    private String name, address, phone;

    public Student2 (String name, String address, String phone){
        this.address = address;
        this.name = name;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

public class 제네릭_컬렉션_577_PROGRAMMING6 {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<Student2>();
        Scanner sc = new Scanner(System.in);
        Student2 student;
        String name1, address1, phone1;
        int selnum;
        student= new Student2("가","나","다");
        list.add(student);
        student = new Student2("라", "바", "다");
        list.add(student);
        student = new Student2("마", "타", "다");
        list.add(student);

        while(true){
            System.out.println("추가(1) | 검색(2) | 삭제(3) | 종료(4)");
            selnum = sc.nextInt();

    switch(selnum){
        case 1:
            System.out.println("이름: ");
            name1 = sc.next();
            System.out.println("주소: ");
            address1 = sc.next();
            System.out.println("전화번호: ");
            phone1 = sc.next();
            student = new Student2(name1, address1, phone1);
            list.add(student);
            break;
        case 2:
            System.out.println("이름 검색: ");
            name1 = sc.next();
            for (Student2 s : list) {
                if (s.getName().equals(name1)) {
                    System.out.println("------------------------------검색된 학생-------------------------");
                    System.out.println("이름: " + s.getName());
                    System.out.println("주소: " + s.getAddress());
                    System.out.println("전화번호 : " + s.getPhone());
                }
            }
            break;
        case 3:
            System.out.println("삭제할 이름: ");
            name1 = sc.next();
            for (Student2 s : list) {
                if (s.getName().equals(s.getName())) {
                    list.remove(s);
                break;
                }
            }
            break;
    }
        }
    }
}
