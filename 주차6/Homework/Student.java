
public class Number1 extends Student {
    Number1() {
        super(1, "이동현");
    }

    public String lab;

    // 서브클래스
    public static void main(String[] args) {
        Students1 = new Number1();
        s1.name = "sex";
    }
}

class Student {
    private int number;
    public String name;

    Student(int number, String name) {
        this.number = number;
        this.name = name;
    }
    // super클래스

    public void setNumber(int number) {
        this.number = number;
    } // 설정자

    public int getNumber() {
        return number;
    } // 접근자

    public void setName(String name) {
        this.name = name;
    } // 설정자

    public String getName() {
        return name;
    } // 접근자

}
