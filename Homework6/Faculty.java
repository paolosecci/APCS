public abstract class Faculty extends Employee
{
    private double salary;
    
    public Faculty(String fName, String lName, String id,
                   int sTime, double salary)
    {
        super(fName, lName, id, sTime);
        this.salary = salary;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void setSalary(double s)
    {
        salary = s;
    }
    
    public String toString()
    {
        String s = super.toString();
        s += "\nSalary: $" + String.format("%.2f", salary);
        return s;
    }
}