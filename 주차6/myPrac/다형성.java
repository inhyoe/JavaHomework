public class 다형성 {

    public static void main(String[] args) {
        Book b1 = new Book("야스","이동현");
        b1.print();

        Book b = new Novel("sex", "한빛");
        b.print();

        Book b2 = new SF("섹스" ,"오랄");
        b2.print();
    }
}
class Book{
    public String name;
    public String publisher; 
    Book(){
    	this.name = "";
        this.publisher = "";
    }
    Book(String name, String publisher){
        this.name = name;
        this.publisher = publisher;
    }
    void print(){
        System.out.println("print : Book");
        System.out.println(name);
        System.out.println(publisher);
    }; 
}

class Novel extends Book{
    public String name;
    public String publisher; 
    Novel(String name, String publisher){
        super(name, publisher);
    }

    @Override
    void print(){
        System.out.println("print : Novel");
        System.out.println(this.name);
        System.out.println(this.publisher);
    }
}

class SF extends Book{
    public String name;
    public String publisher; 
    SF(String name, String publisher){
        super(name, publisher);
    }
    @Override
    void print(){
        System.out.println("print : SF");
        System.out.println(this.name);
        System.out.println(this.publisher);
    }
}
