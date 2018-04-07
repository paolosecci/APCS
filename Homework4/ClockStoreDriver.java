public class ClockStoreDriver
{
    public static void main(String[] args)
    {
        ClockStore clockstore1 = new ClockStore();
        System.out.println(clockstore1);
        
        System.out.println("The Clock w the greatest number of seconds is:");
        System.out.println(clockstore1.mostSeconds());
    }
}