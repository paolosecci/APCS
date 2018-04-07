public class MyPod extends MyDevice
{
    private boolean isTouch;
    private String[] songs;
    
    public MyPod( int memory, String color, boolean isT, String[] tunes)
    {
      super(memory, color);
      isTouch = isT;
      songs = tunes;
    }
    
    //getters
    public boolean getIsTouch()
    {
        return isTouch;
    }
    public String[] getSongs()
    {
        return songs;
    }
    //setters
    public void setIsTouch(boolean isT)
    {
        isTouch = isT;
    }
    public void setSongs(String[] tunes)
    {
        songs = tunes;
    }
    
    public String toString()
    {
        String out = super.toString() + "\n";
        out += "touchscreen: ";
        if (isTouch)
        {
            out += "yes\n";
        }
        else
        {
            out += "no\n";
        }
        for( int i = 0; i < songs.length; i++)
        {
            out += (i+1) + ". " + songs[i] + "\n";
        }
        return out;
    }
}