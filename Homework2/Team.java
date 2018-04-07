public class Team
{
    //define variables
    private String name;
    private String city;
    private int championships;
    private String league;

    //4 arg constructor
    public Team(String name, String city, int championships, String league)
    {
        this.name = name;
        this.city = city;
        this.championships = championships;
        this.league = league;
    }

    //default constructor
    public Team()
    {
        this.name = "Lakers";
        this.city = "Los Angeles";
        this.championships = 17;
        this.league = "NBA";
    }

    //return with toString
    public String toString()
    {
        return ( "The " + city + " " + name + " have " + championships +
                " championships in the " + league + ".");

    }
}