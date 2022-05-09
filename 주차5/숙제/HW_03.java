package 주차5.숙제;

public class HW_03 {
    public static void main(String[] args) {
        Moive mv = new Moive();
        mv.title = "살인의추억";
        mv.grade = 10.0;
        mv.dirt = "봉준호";
        mv.year= 2003;
        mv.Print();
    }
}
class Moive{
    String title;
    double grade;
    String dirt;
    int year;
    void Print(){
        System.out.println("영화 제목: " + title);
        System.out.println("평점: " + grade);
        System.out.println("감독: "+ dirt);
        System.out.println("연도: " + year);
    }
    @Override
    public String toString() {
        
        return toString();
    }
}