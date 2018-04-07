public class ClockDriver
{
    public static void main(String[] args)
    {
        Clock clock1 = new Clock(1, 2, 3);
        Clock clock2 = new Clock(12, 0, 0);
        Clock clock3 = new Clock();
        Clock clock4 = new Clock();
        
        clock1.setTime(1, 5, 30);
        System.out.println(clock1);
        clock1.getDayLightSavings();
        System.out.println(clock1);
    }
}