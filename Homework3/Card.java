public class Card
{
    //define variables
    private int number;
    private String suit;
    
    

    //2 arg constructor
    public Card( int number, String suit )
    {
        this.number = number;
        this.suit = suit;
    }
    //default constructor
    public Card()
    {
        this.number = randomNumber();
        this.suit = randomSuit();
    }
    
    
    public String getSuit()
    {
        return suit;
    }
    
    
    //random number (1-13)
    public int randomNumber()
    {
        int randomNumber = (int)(Math.random()*13 + 1);
        return randomNumber;
    }
    //random suit
    public String randomSuit()
    {
        String randomSuit = "";
        int i = (int)(Math.random()*4);
        if ( i == 0 )
        {
            randomSuit = "Spades";
        }
        else if ( i == 1 )
        {
            randomSuit = "Hearts";
        }
        else if ( i == 2 )
        {
            randomSuit = "Diamonds";
        }
        else if ( i == 3 )
        {
            randomSuit = "Clubs";
        }
        return randomSuit;
    }
    
    
    //return using toString()
    public String toString()
    {
        if(this.number == 11)
        {
            return ( "Jack of " + this.suit);
        }
        else if(this.number == 12)
        {
            return ( "Queen of " + this.suit);
        }
        else if(this.number == 13)
        {
            return ( "King of " + this.suit);
        }
        else
        {
            return ( this.number + " of " + this.suit);
        }
    }
}