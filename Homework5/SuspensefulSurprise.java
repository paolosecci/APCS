import javax.swing.JOptionPane;
public class SuspensefulSurprise
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("What surprise do u want:\n\n"
                                                    + "A. holiday surprise\n"
                                                    + "B. a good friend\n"
                                                    + "C. something worse than Ben Carson\n"
                                                    + "D. something that'll piss you off");
        
        System.out.println("Wait for it...");
        for (int i = 0; i < 75000000; i++)
        {
            System.out.print("");
        }
        if ( input.equals("A") || input.equals("a") )
        {
            System.out.println("Santa... watching you while you sleep");
        }
        else if ( input.equals("B") || input.equals("b") )
        {
            System.out.println("sike:\nBILL COSBY!");
        }
        else if ( input.equals("C") || input.equals("c") )
        {
            System.out.println("Auschwitz.");
        }
        else if ( input.equals("D") || input.equals("d") )
        {
            System.out.println();
        }
    }
}