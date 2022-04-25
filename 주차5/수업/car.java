package 주차5.수업;



public class car{

    String name;
    String what;

    String name(String get){
        return name = get;
    }    
    String what(String get){
        return what = get;
    }
    public String toString(){
        return String.format("name = %s,[이름은 name =%s,내용 : what =%s]",name,name,what);
    }

    public static void main(String[] args) {
        car myCar = new car();
        String name = myCar.name("이동현");
        String what = myCar.what("킹갓제너럴엠페러충무공마제스티두루치기");
        System.out.println(myCar);
    }
}
