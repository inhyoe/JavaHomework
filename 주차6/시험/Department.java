package 시험;


public class Department{
    private Employee[] empList;
    private int index;

    public void addEmp(Employee e){
        empList.add(e);
    }

    public void payList(){
        
    }
}

abstract class Employee{
    private String name;

    abstract int getPay(); 
}

class Permanent extends Employee{
    private int salary;

    Permanent(int salary){
        this.salary = salary;
    }

    public int getPay(){
        return salary/12;
    }
}

class Temporary extends Employee{
    private int time,pay ;

    Temporary(int time, int pay){
        this.time = time;
        this.pay = pay;
    }

    public int getPay(){
        return time*pay;
    }
}

class SalesPerson extends Employee{
    private int sales;

    SalesPerson(int sales){
        this.sales = sales;
    }

    public int getPay(){
        return (int)(sales * 0.5);
    }
}