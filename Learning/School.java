public class School
{
    public static void main(String[] args)
    {
        Swag[] squad = new Swag[3];
        
        Thug thug1 = new Thug("Paolo", "Secci", 1, 35);
        Thug thug2 = new Thug("John", "Harris", 37, 40);
        Nerd nerd1 = new Nerd("Patrick", "Harris", 12, 13);
        
        squad[0] = thug1;
        squad[1] = thug2;
        squad[2] = nerd1;
    }
}