public class Song
{
    private String title;
    private String artist;
    private int seconds;
    private int yearReleased;
    
    // start constructors
    public Song()
    {
        this.title = "Dream On";
        this.artist = "Aerosmith";
        this.seconds = 267;
        this.yearReleased = 1973;
    }// end default constructor
    public Song(String title, String artist, int seconds, int yearReleased)
    {
        this.title = title;
        this.artist = artist;
        this.seconds = seconds;
        this.yearReleased = yearReleased;
    } // end 4 arg constructor Song
    // end constructors
    
    
    
    // start getters + setters
    public String getTitle()
    {
        return title;
    }// end title getter
    public void setTitle(String title)
    {
        this.title = title;
    }// end title setter
    public String getArtist()
    {
        return artist;
    }// end artist getter
    public void setArtist(String artist)
    {
        this.artist = artist;
    }// end artist setter
    public int getSeconds()
    {
        return seconds;
    }// end seconds getter
    public void setSeconds(int seconds)
    {
        this.seconds = seconds;
    }// end seconds setter
    public int getYearReleased()
    {
        return yearReleased;
    }// end year released getter
    public void setYearReleased(int yearReleased)
    {
        this.yearReleased = yearReleased;
    }// end year released setter
    // end getters + setters
    
    
    
    //start toString
    public String toString()
    {
        return ("\"" + title + "\"" + " by " + artist + ": " + seconds
                + " seconds, released in " + yearReleased);
    } // end method toString
    
} // end class