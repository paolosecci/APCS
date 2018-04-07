public class Student
{
    //define variables
    private String firstName;
    private String lastName;
    private boolean cumLaude;
    private double[] grades = new double[5];

    //4 arg constructor
    public Student( String firstName, String lastName, boolean cumLaude, double english,
    double math, double science, double fineArts, double socialScience)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cumLaude = cumLaude;
        this.grades[0] = english;
        this.grades[1] = math;
        this.grades[2] = science;
        this.grades[3] = fineArts;
        this.grades[4] = socialScience;
    }

    //generic constructor
    public Student()
    {
        this.firstName = "Paolo";
        this.lastName = "Secci";
        this.cumLaude = false;
        this.grades[0] = 0.0;
        this.grades[1] = 0.0;
        this.grades[2] = 0.0;
        this.grades[3] = 0.0;
        this.grades[4] = 0.0;
    }

    //set gpa method
    public double setGrades(double english, double math, double science, double fineArts, double socialScience)
    {
        this.grades[0] = english;
        this.grades[1] = math;
        this.grades[2] = science;
        this.grades[3] = fineArts;
        this.grades[4] = socialScience;

        return calcGPA();
    }

    //calcGPA
    public double calcGPA()
    {
        double gpa = 0.00;
        for( int i = 0; i < grades.length; i++ )
        {
            if ( grades[i] >= 90.0 )
            {
                gpa += 4.00;
            }
            else if( 90.0 > grades[i] && grades[i] >= 80.0 )
            {
                gpa += 3.00;
            }
            else if( 80.0 > grades[i] && grades[i] >= 70.0 )
            {
                gpa += 2.00;
            }
            else if( 70.0 > grades[i] && grades[i] >= 60.0 )
            {
                gpa += 1.00;
            }
            else
            {
                gpa += 0.00;
            }
        }
        gpa = gpa/grades.length;
        return gpa;
    }

    //assign letter grades
    public String calcGrade()
    {
        String grade = "";
        if (calcGPA() >= 4)
        {
            return "A";
        }
        else if (calcGPA() >= 3)
        {
            return "B";
        }
        else if (calcGPA() >= 2)
        {
            return "C";
        }
        else if (calcGPA() >= 1)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }

    //convert grades array into string
    public String gradeString()
    {
        String gradeString = "";
        for( int i = 0; i < grades.length; i++ )
        {
            gradeString += (grades[i] + "\t");
        }
        return gradeString;
    }
    
    //convert each class gpa array into Strings
    public String gpaString()
    {
        String gpaString = "";
        double gpa = 0.00;
        for( int i = 0; i < grades.length; i++ )
        {
            if ( grades[i] >= 90.0 )
            {
                gpa = 4.00;
            }
            else if( 90.0 > grades[i] && grades[i] >= 80.0 )
            {
                gpa = 3.00;
            }
            else if( 80.0 > grades[i] && grades[i] >= 70.0 )
            {
                gpa = 2.00;
            }
            else if( 70.0 > grades[i] && grades[i] >= 60.0 )
            {
                gpa = 1.00;
            }
            gpaString += (gpa + "\t");
        }
        return gpaString;
    }
    
    //return with a toString()
    public String toString()
    {

        return  (
                "first name: " + firstName + "\n" +
                "last name: " + lastName + "\n" +
                "cum laude society: " + cumLaude + "\n" +
                firstName + "'s Average GPA is: " + calcGPA() + "\n" +
                firstName + "'s Grade is: " + calcGrade() + "\n" +
                gradeString() + "\n" +
                gpaString() + "\n"
                );

        
    }
}