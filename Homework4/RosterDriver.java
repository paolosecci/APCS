public class RosterDriver
{
    public static void main(String[] args)
    {
        Roster roster1 = new Roster();
        System.out.println(roster1);
        
        System.out.println("This is the highest GPA on the roster: " + roster1.findMaxGPA());
        
    }
}