import java.util.ArrayList;
public class FamilyMembers
{
    public static void main(String[] args)
    {
        ArrayList<String>family;
        family = new ArrayList<String>();
        
        family.add("Cecco");
        family.add("Maru");
        family.add("Lorenzo");
        family.add("Francesco");
        family.add("Isabella");
        family.add("Me");
        
        System.out.print("This is the size of the family: ");
        System.out.println(family.size());
        System.out.println();
        
        
        System.out.println("This is printing with a for loop: ");
        for (int i = 0; i < family.size(); i++)
        {
            System.out.println(family.get(i));
        }
        System.out.println();
        
        
        System.out.println("This is printing with a for-each loop: ");
        for (String member: family)
        {
            System.out.println(member);
        }
    }
}