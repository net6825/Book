package book.ch11_상속;

public class inheritance_상속_259_LAB1SUB extends ch11_상속_259_LAB1 {
    @Override
    public String toString() {
        return super.toString() + "major" + major;
    }

    String major;

    public inheritance_상속_259_LAB1SUB(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public static void main(String[] args) {
        inheritance_상속_259_LAB1SUB a1 = new inheritance_상속_259_LAB1SUB("명진", 21, "컴퓨터");
        inheritance_상속_259_LAB1SUB b1 = new inheritance_상속_259_LAB1SUB("미현", 22, "경영");
        inheritance_상속_259_LAB1SUB c1 = new inheritance_상속_259_LAB1SUB("용준", 24, "경제");
    }
}
