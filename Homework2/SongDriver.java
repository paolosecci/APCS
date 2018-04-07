public class SongDriver
{
    public static void main(String[] args)
    {
        Song song1 = new Song("Bohemian Rhapsody", "Queen", 355, 1975);
        Song song2 = new Song("Stairway to Heaven", "Ledd Zeppelin", 483, 1971);
        Song song3 = new Song();
        Song song4 = new Song();
        
        System.out.println(song1.getTitle());
        song1.setTitle("Lazing on a Sunday Afternoon");
        System.out.println(song1.getTitle());
    } // end main method
} // end class