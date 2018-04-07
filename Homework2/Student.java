public class Student
{
    //define variables
    private String firstName;
    private String lastName;
    private double gpa;
    private boolean cumLaude;
    
    //4 arg constructor
    public Student( String firstName, String lastName, double gpa, boolean cumLaude )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.cumLaude = cumLaude;
    }
    //generic constructor
    public Student()
    {
        this.firstName = "Paolo";
        this.lastName = "Secci";
        this.gpa = 4.12;
        this.cumLaude = false;
    }
    
    //return with a toString()
    public String toString()
    {
        return (firstName + " " + lastName + " has a " + gpa +
               " GPA. He is in the Cum Laude Society: " + cumLaude + ".");
    }
    
    
    
    
    
    
    
}