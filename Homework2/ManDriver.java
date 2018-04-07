public class ManDriver
{
    public static void main(String[] args)
    {
        Man paolo = new Man();
        System.out.println("This is default man: ");
        System.out.println(paolo);
        System.out.println();
        
        Man obama = new Man("Barack", 54, 6);
        System.out.println("This is a mildly stressed Obama: ");
        System.out.println(obama);
        System.out.println();
        
        Man cobain = new Man("Kurt Cobain", 27, 0);
        System.out.println("This is an extremly unhappy man: ");
        System.out.println(cobain);
        
    }
}