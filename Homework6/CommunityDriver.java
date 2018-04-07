import java.util.ArrayList;
public class CommunityDriver
{
    public static void main(String[] args)
    {
        Teacher paolo = new Teacher("Paolo", "Secci", "2016721", 7, 21000.00, 2, 1);
        Staff chris = new Staff("Chris", "Villegas", "2016237", 8, 9, 21.75);
        Teacher michael = new Teacher("Michael", "Castano", "2016123", 8, 19999.99, 1, 1);
        Staff jack = new Staff("Jack", "Hock", "2016345", 8, 10, 20.25);
        Staff alex = new Staff("Alex", "Bistagne", "2015111", 8, 14, 8.50);
        
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(paolo);
        employees.add(chris);
        employees.add(michael);
        employees.add(jack);
        employees.add(alex);
        
        for (int i = 0; i < employees.size(); i++)
        {
            System.out.println(employees.get(i) + "\n");
        }
    }
}