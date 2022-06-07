import java.util.Arrays;

public class PersonTest {
    
    public static void main(String[] args) {
        Person p1 = new Person("이동현", 172);
        Person p2 = new Person("오희재", 172);
        Person[] p3 = new Person[3];
        p3[0] = new Person("이동현", 172);
        p3[1] = new Person("오희재", 172);
        p3[2] = new Person("김종원", 176);

        SecondPerson s1 = new SecondPerson("야동현",230);

        
        System.out.println("상속 비교 : "+p1.compareTo(s1));
        p1.getMaximum(p3);
        
    }
    
}


class Person implements Comparable<Person>{
    private String name;
    private int height;
    Person(){

    }
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

    public String getMaximum(Person[] array){
        Person[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
        return temp[temp.length-1].name;
    }
}  

class SecondPerson extends Person{
    private String name;
    private int height;

    SecondPerson(String name, int height){
        this.name = name;
        this.height = height;
    }
}