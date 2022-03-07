package book.ch11_상속;

class Student {
    private int number;
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student(int number, String name) {
        super();
        this.name = name;
        this.number = number;
    }
}

public class GraduateStudent extends Student {
    public String lab;

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public GraduateStudent(int number, String name, String lab) {
        super(number, name);
        this.lab = lab;
    }
}
