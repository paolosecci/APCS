
public class APLine
{
    int a;
    int b;
    int c;
    
    public APLine ( int a, int b, int c )
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getSlope()
    {
        double slope = 0;
        slope = -a / ((double) b);
        return slope;
    }
    
    public boolean isOnLine( int x, int y )
    {
        boolean onLine = false;
        if ( (a*x + b*y + c) == 0 )
        {
            onLine = true;
        }
        return onLine;
    }
    
    public String toString()
    {
        return a + "x + " + b + "y + " + c;
    }
}
