public abstract class CommunityMember
{
    private String firstName, lastName;
    
    public CommunityMember(String fName, String lName)
    {
        firstName = fName;
        lastName = lName;
    }
    
    public String getFName()
    {
        return firstName;
    }
    
    public void setFName(String fName)
    {
        firstName = fName;
    }
    
    public String getLName()
    {
        return lastName;
    }
    
    public void setLName(String lName)
    {
        lastName = lName;
    }
    
    public String toString()
    {
        return lastName + ", " + firstName;
    }
}