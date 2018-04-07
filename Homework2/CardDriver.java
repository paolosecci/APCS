public class CardDriver
{
    public static void main(String[] args)
    {
        Card card0 = new Card();
        Card card1 = new Card( 13, "Clubs" );
        Card card2 = new Card( 7 , "Hearts" );

        //create array
        Card[] myHand = new Card[3];

        //hardcode the array
        myHand[0] = card0;
        myHand[1] = card1;
        myHand[2] = card2;

        //print using for loop
        for (int i = 0; i < myHand.length; i++)
        {
            System.out.println(myHand[i]);
        }
    }
}