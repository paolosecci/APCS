public class Clock
{
    private int hour;
    private int min;
    private int sec;
    
    
    //3 arg constructor
    public Clock(int hour, int min, int sec)
    {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    //default constructor
    public Clock()
    {
        this.hour = 7;
        this.min = 36;
        this.sec = 3;
    }

    //setter time
    public String setTime(int hour, int min, int sec)
    {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        return hour + ":" + min + ":" + sec;
    }
    
    //double digits sec
    private String sec()
    {
        String returnSec = "";
        if (sec < 10)
        {
            returnSec += "0";
        }
        return returnSec + sec;
    }
    
    //double didgits min
    private String min()
    {
        String returnMin = "";
        if (min < 10)
        {
            returnMin += "0";
        }
        return returnMin + min;
    }
    
    //Total Seconds method
    public int totalSec()
    {
        int totalSec = hour * 3600 + min * 60 + sec;
        return totalSec;
    }
    
    //Day Light Savings method
    public String getDayLightSavings()
    {
        this.hour = 1 + hour;
        return this.hour + ":" + min() + ":" + sec();
    }
    
    //return using toString()
    public String toString()
    {
        return hour + ":" + min() + ":" + sec() + "\nThere have been " + totalSec() +
               " seconds in the day.";
    }
}