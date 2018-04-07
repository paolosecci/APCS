public class Car
{
    //define variables
    private String make;
    private int year;
    private double mpg;
    private boolean xradio;
    
    
    //4 arg constructor
    public Car( String make, int year, double mpg, boolean xradio )
    {
        this.make = make;
        this.year = year;
        this.mpg = mpg;
        this.xradio = xradio;
    }
    
    //default constructor
    public Car()
    {
        this.make = "Lambourghini";
        this.year = 2014;
        this.mpg = 12.5;
        this.xradio = true;
    }
    
    //getters & setters
    public String getMake()
    {
        this.make = make;
        return make;
    }
    public void setMake(String make)
    {
        this.make = make;
    }
    
    //return using toString
    public String toString()
    {
        return ("The " + year + " " + make + " gets " + mpg +
                " miles per gallon.\nThe car has XM radio: " + xradio + ".\n");
    }
}