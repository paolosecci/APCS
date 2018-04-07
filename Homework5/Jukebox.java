public class Jukebox
{
    int a = 4;
    int b = 4;
    
    private MySong[][] songList = new MySong[a][b];
    
    public Jukebox()
    {
        songList[0][0] = new MySong("Stairway to Heaven", 5);
        songList[0][1] = new MySong("The World is Yours", 4);
        songList[0][2] = new MySong("Fight the Power", 3);
        songList[0][3] = new MySong("Love Me Two Times", 5);
        songList[1][0] = new MySong("Crank That (Souja Boy)", 1);
        songList[1][1] = new MySong("Born Sinner", 5);
        songList[1][2] = new MySong("Juicy", 4);
        songList[1][3] = new MySong("6 Foot 7 Foot", 3);
        songList[2][0] = new MySong("Kung Fu Fighting", 2);
        songList[2][1] = new MySong("Ice Ice Baby", -1);
        songList[2][2] = new MySong("You Got Me", 4);
        songList[2][3] = new MySong("Under The Bridge", 4);
        songList[3][0] = new MySong("Hotline Bling", 2);
        songList[3][1] = new MySong("Civil War", 3);
        songList[3][2] = new MySong("Shine on You Crazy Diamond", 5);
        songList[3][3] = new MySong("Gangnam Style", 1);
    }
    
    public MySong randomSong()
    {
        MySong randomSong = songList[(int)(Math.random() * a)][(int)(Math.random() * b)];
        return randomSong;
    }
    
    public String playSongsOfRating(int rating)
    {
        String returnRatings = "Songs with rating of " + rating + ":\n";
        for (int row = 0; row < songList.length; row++)
        {
            for (int col = 0; col < songList[row].length; col++)
            {
                if (songList[row][col].getRating() == rating)
                {
                    returnRatings += (songList[row][col] + "\n");
                }
            }
        }
        return returnRatings;
    }
    
    public String toString()
    {
        String returnString = "";
        for (int row = 0; row < songList.length; row++)
        {
            returnString += "--" + row + "--\n";
            for (int col = 0; col < songList[row].length; col++)
            {
                returnString += (songList[row][col] + "\n");
            }
        }
        return returnString;
    }
}