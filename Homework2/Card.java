public class Card
{
    //define variables
    private int number;
    private String suit;

    private int J = 10;
    private int Q = 10;
    private int K = 10;
    
    //3 arg constructor
    public Card( int number, String suit)
    {
        this.number = number;
        this.suit = suit;
    }

    //default constructor
    public Card()
    {
        this.number = 3;
        this.suit = "Spades";
    }

    //return using toString()
    public String toString()
    {
        if(number == 11)
        {
            return ( "Jack" + "of" + suit + " has value: " + J);
        }
        else if(number == 12)
        {
            return ( "Queen" + "of" + suit + " has value: " + Q);
        }
        else if(number == 13)
        {
            return ( "King" + " of " + suit + " has value: " + K);
        }
        return ( number + " of " + suit + " has value: " + number);
    }
}
