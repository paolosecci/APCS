public class Man
{
    private String name;
    private int age;
    private int happinessRating;
    private boolean isContentWithOutcomeOfLife;
    
    public Man()
    {
        this.name = "Paolo";
        this.age = 17;
        this.happinessRating = 9;
        if (happinessRating >= 7)
        {
            isContentWithOutcomeOfLife = true;
        }
    }
    
    public Man( String name, int age, int happinessRating )
    {
        this.name = name;
        this.age = age;
        this.happinessRating = 9;
        if (happinessRating >= 7)
        {
            isContentWithOutcomeOfLife = true;
        }
    }
    
    public String toString()
    {
        String returnString = "";
        
        if (this.happinessRating == 0)
        {
            returnString += "YOU NEED TO HELP THIS MAN";
        }
        else if (isContentWithOutcomeOfLife)
        {
            returnString += "is content with the outcome of life";
        }
        else
        {
            returnString += "is not content with the outcome of life";
        }
        return name + " is " + age + " years old and "+ returnString + ".";
    }
}