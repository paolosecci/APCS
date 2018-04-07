public class SongDriver
{
    public static void main(String[] args)
    {
        // title, artist, year released, length in seconds, is it Fire?
        Song song1 = new Song( "You Got Me", "The Roots", 1999, 259, true );
        Song song2 = new Song( "Hotline Bling", "Drake", 2015, 259, false );
        Song song3 = new Song();
        Song song4 = new Song();
        
        //print both 3 and 4
        System.out.println("song 3: " + song3);
        System.out.println("song 4: " + song4);
        System.out.println("");
        
        //test getter method
        System.out.println("year released is: " + song4.getYearReleased());
        System.out.println("");
        
        //change year to 2020 using setter
        song4.setYearReleased(2020);
        
        //check to c if they worked
        System.out.println("");
        System.out.println("song 3: " + song3);
        System.out.println("song 4: " + song4);
    }
}