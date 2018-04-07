public class PreciseClock extends Clock
{
    private int seconds;
    
    public PreciseClock()
    {
        super();
        seconds = 0;
    }
    
    public PreciseClock(int h, int m, int s, boolean a)
    {
        super(h, m, a);
        seconds = s;
    }
    
    public String toString()
    {
        String output = "";
        output += getHours() + ":";
        if (getMinutes() < 10)
        {
            output += ("0");
        }
        output += getMinutes() + ":";
        if (seconds < 10)
        {
            output += ("0");
        }
        output += seconds;
        if (getIsAM())
        {
            output += " AM";
        }
        else
        {
            output += " PM";
        }
        
        return output;
    }
}