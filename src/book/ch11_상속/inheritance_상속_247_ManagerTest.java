package book.ch11_상속;

class Employee {
    public String name;
    String address;
    protected int salary;
    private int RRN;

    public String toString() {
        return name + ", " + address + "," + RRN + ", " + salary;
    }
}

class Manager extends Employee {
    private int bonus;

    public void printSalary() {
        System.out.println(name + "(" + address + " ):" + (salary + bonus));
    }

    public void printRRN() {
//        System.out.println(RRN); //priavet이라 상속이 되지 않음 그래서 오류
    }
}

public class inheritance_상속_247_ManagerTest {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.printRRN();
    }
}
