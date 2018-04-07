import java.util.ArrayList;
public class MyPod
{
    private String color;
    private int memorySize;
    private ArrayList<Song>songLibrary;
    
    public MyPod()
    {
        this.color = "Silver";
        this.memorySize = 16;
        
        this.songLibrary = new ArrayList<Song>();
        for(int i = 0; i < 3; i++)
        {
            this.songLibrary.add(new Song());
        }
    }//default constructor
    
    public MyPod( String color, int memorySize, Song song1 , Song song2 , Song song3)
    {
        this.color = color;
        this.memorySize = memorySize;
        this.songLibrary = new ArrayList<Song>();
        this.songLibrary.add(song1);
        this.songLibrary.add(song2);
        this.songLibrary.add(song3);
    }// multi arg constructor
    
    public String toString()
    {
        String returnString = "";
        for ( int i = 0; i < songLibrary.size(); i++)
        {
            returnString += (songLibrary.get(i) + "\n");
        }
        return  (
                "The " + color + " " + memorySize + " " +
                "GB myPod has the following songs:\n" +
                returnString
                );
    }
}