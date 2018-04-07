public class RightTriangle
{
    //define variable types
    private int base;
    private int height;
    
    //Constructors
    public RightTriangle()
    {
        this.base = 0;
        this.height = 0;
    }//end default constructor
    public RightTriangle( int base, int height )
    {
        this.base = base;
        this.height = height;
    }//end 2 arg constructor
    
    
    //getter & setter
    public int getBase()
    {
        return base;
    }//end getter
    public void setBase( int base )
    {
        this.base = base;
    }//end setter
    
    
    //Calculate Hypotenuse
    private double calcHypotenuse()
    {
        double hypotenuse = (Math.sqrt(base*base + height*height));
        return hypotenuse;
    }
    
    //Calculate Theta
    private double calcTheta()
    {
        double dubBase =  this.base;
        double dubHeight = this.height;
        double theta = Math.atan(dubHeight / dubBase)*(180/3.14159265);
        return theta;
    }
    
    //Calculate Area
    private double calcArea()
    {
        double dubBase = this.base;
        double dubHeight = this.height;
        double area = (dubBase*dubHeight)/2;
        return area;
    }
    
    //return using toString()
    public String toString()
    {
        if( base == 0 || height == 0)
        {
            return ("The base and/or height of this triangle is zero.\n"
                    +"There are no stats available for this triangle.");
        }
        else
        {
            return ("The length of the base is: " + base + " meters.\n"
                    + "The length of the height is: " + height + " meters.\n"
                    + "The length of the hypotenus is: " + calcHypotenuse() + " meters.\n"
                    +"The angle of theta is: " + calcTheta() + " degrees.\n"
                    +"The area of the triangle is: " + calcArea() + " square meters.");
        }
    }
    
}