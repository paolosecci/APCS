public class JukeboxDriver
{
    public static void main(String[] args)
    {
        Jukebox defaultJukebox = new Jukebox();
        
        System.out.println(defaultJukebox);
        System.out.println("Here is a random song:\t" + defaultJukebox.randomSong() + "\n");
        System.out.println(defaultJukebox.playSongsOfRating(5));
    }
}