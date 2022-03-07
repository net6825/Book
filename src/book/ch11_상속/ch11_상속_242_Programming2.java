package book.ch11_상속;

class Person {
    String name;
    String address;
    String phone;

    public Person(String name, String address, String phone) {
        super();
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

//Customer
class Customer extends Person {
    int CNumber;
    int mileage;

    public Customer(String name, String address, String phone, int CNumber, int mileage) {
        super(name, address, phone);
        this.CNumber = CNumber;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", CNumber=" + CNumber +
                ", mileage=" + mileage +
                '}';
    }
}

public class ch11_상속_242_Programming2 {
    public static void main(String[] args) {
        Customer a = new Customer("a", "b", "c", 1, 2);
        Customer b = new Customer("d", "e", "f", 3, 4);
        Customer c = new Customer("g", "h", "i", 5, 6);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
