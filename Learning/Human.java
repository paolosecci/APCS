public abstract class Human
{
    private String first;
    private String last;
    
    public Human()
    {
        first = "Paolo";
        last = "Secci";
    }
    
    public Human(String firstN, String lastN)
    {
        first = firstN;
        last = lastN;
    }
    
    public String toString()
    {
        return first + " " + last;
    }
}