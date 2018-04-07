public class CarDriver
{
    public static void main(String[] args)
    {
        Car car1 = new Car ("Audi", 2008, 17.3, true);
        Car car2 = new Car();
        
        System.out.println( car1 );
        System.out.println( car2 );
    }
}