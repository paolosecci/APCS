public class MyPhone extends MyDevice
{
    private int number;
    private String[] contacts;
    
    public MyPhone(int memory, String color, int numba, String[] peoples)
    {
        super(memory, color);
        number = numba;
        contacts = peoples;
    }
    
    
}