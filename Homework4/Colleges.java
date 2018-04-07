import java.util.ArrayList;
public class Colleges
{
    public static void main(String[] args)
    {
        ArrayList<String>colleges;
        colleges = new ArrayList<String>();
        
        colleges.add("UCSB");
        colleges.add("UCLA");
        colleges.add("Berkeley");
        colleges.add("NorthWestern");
        colleges.add("UCSD");
        colleges.add("CalPolySLO");
        
        System.out.println("This is how many items are in the colleges array: " +
                            colleges.size() + "\n");
        
        System.out.println("This is the array:");
        for (String college: colleges)
        {
            System.out.println(college);
        }
        
        //traverse array and set all 4 letter words to null
        for (int i = 0; i < colleges.size(); i++)
        {
            if (colleges.get(i).length() == 4)
            {
                colleges.remove(i);
                i--;
            }
        }
        
        System.out.println("\nThis is the array size after removal: " +
                            colleges.size());
        
        System.out.println("\nThis is the array with no 4 letter schools:");
        for (String college: colleges)
        {
            System.out.println(college);
        }
    }
}