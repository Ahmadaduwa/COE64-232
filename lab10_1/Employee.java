package lab10_1;

public class Employee extends Person{
    protected boolean isMarried;
    protected int salary;

    public Employee(){
        isMarried = false;
        salary = 0;
    }

    public Employee(String n, int y, Boolean m, int s){
        super(n,y);
        this.isMarried = m;
        this.salary = s;
    }

    public boolean getIsMarried(){
        return isMarried;
    }

    public int getSalary() {
        return salary;
    }

    public String toString(){
       String married;
        if (isMarried) {
            married = "Married";
        } else {
            married = "Single";
        }

        return super.toString()+", Status: "+married+", Salary: "+salary;
    }
    
}
