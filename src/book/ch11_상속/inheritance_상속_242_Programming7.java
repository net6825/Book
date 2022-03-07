package book.ch11_상속;

class Student1 {
    private String name;
    private String major;
    private int number;
    private int grade;
    private int point;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Student1(String name, String major, int number, int grade, int point) {
        this.name = name;
        this.major = major;
        this.number = number;
        this.grade = grade;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", number=" + number +
                ", grade=" + grade +
                ", point=" + point +
                '}';
    }
}

class UnderGraduate extends Student1 {
    private String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public UnderGraduate(String name, String major, int number, int grade, int point, String group) {
        super(name, major, number, grade, point);
        this.group = group;
    }

    @Override
    public String toString() {
        return super.toString() + group;
    }
}

class Graduate extends Student1 {
    private String assistant;
    private int scholarship;

    public Graduate(String name, String major, int number, int grade, int point, String assistant, int scholarship) {
        super(name, major, number, grade, point);
        this.assistant = assistant;
        this.scholarship = ((scholarship == 1) ? 1 : 0);
    }

    @Override
    public String toString() {
        return super.toString() + assistant + this.scholarship;
    }
}

public class inheritance_상속_242_Programming7 {
    public static void main(String[] args) {
        UnderGraduate a = new UnderGraduate("a", "a", 1, 1, 1, "a");
        Graduate b = new Graduate("b", "b", 2, 2, 2, "b", 1);
        System.out.println(a);
        System.out.println(b);
        a.setPoint(44);
        b.setNumber(6666);
        System.out.println(a);
        System.out.print(b);
    }
}