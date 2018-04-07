public class ClockStore
{
    private Clock clocksInStock[] = new Clock[3];
    
    public ClockStore()
    {
        clocksInStock[0] = new Clock(12, 34, 56);
        clocksInStock[1] = new Clock(4, 5, 6);
        clocksInStock[2] = new Clock(10, 0, 7);
    }
    
    public int mostSeconds()
    {
        int highestTotalSec = 0;
        int highestClock = 0;
        for (int i = 0; i < clocksInStock.length; i++)
        {
            if(highestTotalSec < clocksInStock[i].totalSec())
            {
                highestTotalSec = clocksInStock[i].totalSec();
            }
        }
        return highestTotalSec;
    }
    
    public String toString()
    {
        String returnString = "";
        for (int i = 0; i < clocksInStock.length; i++)
        {
            returnString += clocksInStock[i] + "\n";
        }
        
        return (
                "The clock store has the following in stock:\n" +
                returnString
               );
    }
}