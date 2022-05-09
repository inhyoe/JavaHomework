package Homework;

class Student{
    private int number;
    private String name;

   Student(){

   }
   Student(int num,String name){

   }


    public int getNum(){
        return number;
    }
    public void setNum(int number){
        this.number = number;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
}

public class GraduateStudent extends Student{
    GraduateStudent(){
        super(1,"me");
    }
    public String lab;


    // 수퍼 클래스는stundent이고 서브 클래스는 GraduateStudent이다
    // 
    
}
