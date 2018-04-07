import javax.swing.JOptionPane;
public class Password
{
    public static void main(String[] args)
    {
        int guessLimit = 4;
        int guessCount = 0;
        boolean isSuccessful = false;

        while(guessCount < guessLimit && !isSuccessful)
        {
            String usernameInput = JOptionPane.showInputDialog("Please enter your username:");
            String passwordInput = JOptionPane.showInputDialog("Please enter your password (ints):");
            int passwordIntInput = Integer.parseInt(passwordInput);

            if ( (usernameInput.equals("batman") && passwordIntInput == 252)
                || (usernameInput.equals("Batman") && passwordIntInput == 252))
            {
                isSuccessful = true;
            }
            else
            {
                System.out.println("Username and Password do not match... attempt "
                                    + (guessCount + 1) + "/" + guessLimit);
                guessCount++;
            }
        }
        if(isSuccessful)
        {
            System.out.println("You've Logged in!");
        }
    }
} // end main method
