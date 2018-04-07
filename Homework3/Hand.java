public class Hand
{
    //define variables
    private int number;
    private String suit;
    private Card card1 = new Card();
    private Card card2 = new Card();
    private Card card3 = new Card();
    private Card card4 = new Card();
    private Card card5 = new Card();

    //default constructor
    public Hand()
    {
        this.card1 = card1;
        this.card2 = card2;
        this.card3 = card3;
        this.card4 = card4;
        this.card5 = card5;
    }
    
    

    //return using toString()
    public String toString()
    {
        return  (
                card1 + "\n" +
                card2 + "\n" +
                card3 + "\n" +
                card4 + "\n" +
                card5 + "\n"
                );
    }
}