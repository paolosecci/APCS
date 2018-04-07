public class Staff extends Employee
{
    private int hoursPerWeek;
    private double hourlyWage;
    
    public Staff(String fName, String lName, String id, int sTime, int hours, double wagePerHour)
    {
        super(fName, lName, id, sTime);
        hoursPerWeek = hours;
        hourlyWage = wagePerHour;
    }
    
    public int getHours()
    {
        return hoursPerWeek;
    }
    
    public double getWage()
    {
        return hourlyWage;
    }
    
    public double getAnnualPay()
    {
        return ((hoursPerWeek * hourlyWage) * 50);
    }
    
    public String toString()
    {
        String out = super.toString();
        out += "\nHours Per Week: " + hoursPerWeek;
        out += "\nHourly Wages: " + hourlyWage;
        return out;
    }
}