package Homework;

public class StudentTest2 {
    public static void main(String[] args) {
        Student4 s2 = new Student4(1,4,"유창훈","컴퓨터정보",3.2);
        UnderGraduate s3 = new UnderGraduate(3, 4, "김종원", "컴정", 5.2,"로스트아크");
        Graduate g1 = new Graduate(2, 4, "김동신", "컴퓨터정보", 0.3, true);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(g1);
    }
}

class Student4 {
    public int grade; // 학년
    public int sid; // 학점
    public String name; // 이름
    public String department; // 학과
    public double point; // 이수 학점

    Student4(int grade, int sid, String name, String department, double d) {
        this.grade = grade;
        this.sid = sid;
        this.name = name;
        this.department = department;
        this.point = d;
    }
    public String toString() {
        return String.format("학년 : %d \n 학번 :%d \n 이름 :%s \n 학과 :%s \n 이수 학점 :%.2f", 
        grade,sid,name,department,point);
    }
}

class UnderGraduate extends Student4 { // 학부생
    private String club;
    
    public void setClub(String club) {
        this.club = club;
    }

    public UnderGraduate(int grade, int sid, String name, String department, double d,String club) {
        super(grade,sid,name,department,d);
        setClub(club);
    }
    
    public String toString() {
        return String.format("학년 : %d \n 학번 :%d \n 이름 :%s \n 학과 :%s \n 이수 학점 :%.2f \n 동아리명 : %s" , 
        grade,sid,name,department,point,club);
    }
}
class Graduate extends Student4{
    private boolean assistant;
    private double scholarship;
    public String getAssistant(){
        if(assistant = true)
            return "교육조교";
        else
            return "연구조교";
    }
    public void setAssistant(boolean assistant) {
        this.assistant = assistant;
    }
    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }
    public double getScholarship() {
        return scholarship;
    }
    public Graduate(int grade, int sid, String name, String department, double d,boolean assistant){
        super(grade,sid,name,department,d);
        setAssistant(assistant);
        setScholarship(scholarship);
    }

    @Override
    public String toString() {
        return String.format("학년 : %d \n 학번 :%d \n 이름 :%s \n 학과 :%s \n 장학금 :%.2f \n 장학 유형: %s" , 
        grade,sid,name,department,point,getAssistant());
    }
}