import javax.swing.JOptionPane;

public class P1I
{
  public static void main(String[] args)
  {
      String uinput = JOptionPane.showInputDialog("Please enter your username:");
      
    if(uinput.equals("batman"))
    {
        String input = JOptionPane.showInputDialog("Please enter your password:");
        
        int num = Integer.parseInt(input);
        int numGuesses = 1;
        
        while(num != 252 && numGuesses < 5)
        {
            input = JOptionPane.showInputDialog("Incorrect password... try Again");
            num = Integer.parseInt(input);
            numGuesses++;
        } //end while
        
        if (num == 252)
        {
            System.out.println("You have successfully logged in");
        }
        else
        {
            System.out.println("Password incorrect too many times, try again later");
        }
    } 
    else
    {
        System.out.println("Username does not exist");
    } // end if
    
    }
  } // end main method