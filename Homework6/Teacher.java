public class Teacher extends Faculty
{
    private String[] classSchedule;
    private int edLevel; // 1 - BA/BS, 2 - MA/MS, 3 - PhD or in-subject MA/MS
    private int credType; // 0 - none, 1 - preliminary, 2 - clear
    
    public Teacher(String fName, String lName, String id,
                   int sTime, double salary, int education, int cred)
    {
        super(fName, lName, id, sTime, salary);
        edLevel = education;
        credType = cred;
    }
    
    public int getCredential()
    {
        return credType;
    }
    
    public void setCredential(int cred)
    {
        if (cred < 0 || cred > 2)
        {
            System.out.println("Invalid Credential Level. Nothing was changed.");
        }
        else
        {
            credType = cred;
        }
    }
    
    public int getEducationLevel()
    {
        return edLevel;
    }
    
    public void setEducationLevel(int education)
    {
        if (education < 1 || education > 3)
        {
            System.out.println("Invalid Education Level. Nothing was changed.");
        }
        else
        {
            edLevel = education;
        }
    }
    
    public double getAnnualPay()
    {
        return super.getSalary();
    }

    public String toString()
    {
        String out = super.toString();
        
        out += "\nEducation: ";
        if (edLevel == 1)
        {
            out += "Bachelor's";
        }
        else if (edLevel == 2)
        {
            out += "Master's";
        }
        else
        {
            out += "PhD";
        }
        
        out += "\nCredential Type: ";
        if (edLevel == 0)
        {
            out += "None";
        }
        else if (edLevel == 1)
        {
            out += "Preliminary";
        }
        else
        {
            out += "Clear";
        }
            
        return out;
    }
}