public class Thug extends Human implements Swag
{
    private int pantsHeight;
    private int chainSize;
    public Thug()
    {
        super();
        pantsHeight = -20;
        chainSize = 24;
    }
    
    public Thug(String fN, String lN, int pH, int cS)
    {
        super(fN, lN);
        pantsHeight = pH;
        chainSize = cS;
    }
    
    public String toString()
    {
        String out = "Thug: ";
        out += super.toString() + "\n";
        out += "pants height\t" + pantsHeight + "\n";
        out += "chain size\t" + chainSize;
        return out;
    }
    
    public int getSwagLevel()
    {
        return chainSize - (pantsHeight/2);
    }
}