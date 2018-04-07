import java.util.ArrayList;
public class Roster
{
    private ArrayList<Student> students;
    
    
    public Roster()
    {
        students = new ArrayList<Student>();
        students.add(new Student("Paolo", "Secci", true, 99.0, 98.0, 97.0, 100.0, 86.0));
        students.add(new Student("Jack", "Hock", false, 89.0, 98.0, 77.0, 80.0, 86.0));
        students.add(new Student("Alex", "Bistagne", true, 100, 100, 100, 100, 100));
    }
    
    public double findMaxGPA()
    {
        double highestGPA = 0;
        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i).calcGPA() > highestGPA)
            {
                highestGPA = students.get(i).calcGPA();
            }
        }
        return highestGPA;
    }
    
    public String toString()
    {
        String returnString = "";
        for (int i = 0; i < students.size(); i++)
        {
            returnString += (students.get(i) + "\n");
        }
        
        return (
                "The roster consists of the following students: " + "\n" + "\n" +
                returnString
               );
    }
}