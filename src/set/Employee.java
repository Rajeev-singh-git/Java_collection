package set;

public class Employee implements Comparable{

    private  String name;
    private int salary;

    public Employee(String name, int Salary){
        this.name=name;
        this.salary=salary;
    }

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int Salary){
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o){
        return 0;
    }

}
