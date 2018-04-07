public abstract class Vehicle
{
    private int numPassengers;

    //default constructor
    public Vehicle()
    {
        this.numPassengers = 0;           
    }

    //int constructor
    public Vehicle( int passengers )
    {
        this.numPassengers = passengers;   
    }

    //return w toString()
    public String toString()
    {
        return "Number of passengers is: " + numPassengers;
    }
}