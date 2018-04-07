public class Nerd extends Human implements Swag
{
    private int pantsHeight;
    private int glassesSize;
    
    public Nerd()
    {
        super();
        pantsHeight = 23;
        glassesSize = 100;
    }
    
    public Nerd(String fN, String lN, int pH, int gS)
    {
        super(fN, lN);
        pantsHeight = pH;
        glassesSize = gS;
    }
    
    public int getSwagLevel()
    {
        return -(pantsHeight + glassesSize);
    }
}