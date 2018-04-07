public class Clock
{
    private int hours, minutes;
    private boolean isAM;

    public Clock()
    {
        hours = 12;
        minutes = 0;
        isAM = true;
    }
    public Clock(int h, int m, boolean a)
    {
        hours = h;
        minutes = m;
        isAM = a;
    }

    
    public int getHours()
    {
        return hours;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public boolean getIsAM()
    {
        return isAM;
    }
    
    
    public String toString()
    {
        String output = hours + ":";
        if (minutes < 10)
        {
            output += "0";
        }
        output += minutes;
        
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