public abstract class Employee extends CommunityMember
{
    private String empID;
    private int serviceTime;
    
    public Employee(String fName, String lName, String id, int sTime)
    {
       super(fName, lName);
       empID = id;
       serviceTime = sTime;
    }
    
    public String getID()
    {
        return empID;
    }
    
    public void setID(String id)
    {
        empID = id;
    }
    
    public int getServiceTime()
    {
        return serviceTime;
    }
    
    public void setServiceTime(int sTime)
    {
        serviceTime = sTime;
    }
    
    public void addService()
    {
        serviceTime++;
    }
    
    public abstract double getAnnualPay();
    
    public String toString()
    {
        String s = super.toString();
        s += "\nEmployee ID: " + empID;
        s += "\nService Time: " + serviceTime;
        return s;
    }
}