package Homework;

public class PersonTest {
    
    public static void main(String[] args) {
        Person p1 = new Person("이동현", 172);
        Person p2 = new Person("오희재", 172);

        p1.compareTo(p2);
        if(p1.compareTo(p2) == 1){
            System.out.println(p1);
        }else if(p1.compareTo(p2) == -1){
            System.out.println(p2);
        }else{
            System.out.println(" 똑같음 ");
        }
    }
}


class Person implements Comparable<Person>{
    private String name;
    private int height;

    Person(String name, int height){
        this.name = name;
        this.height = height;
    }
    
    Person(int height){
        this.height = height;
    }

    @Override
    public int compareTo(Person i) {
        if(this.height > i.height){
            return 1;
        }else if(this.height < i.height){
            return -1;
        }else{
            return 0;
        }
    }
    @Override
    public String toString() {
        return String.format("가장 키가 큰 사람은 %s", this.name);
    }
}