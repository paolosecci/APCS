import javax.swing.JOptionPane;
public class PasswordAnnoyance
{
    public static void main(String[] args)
    {
        boolean goodPassword = false;
        boolean hasNumber = false;
        boolean hasNonAlpha = false;
        String nonAlphaChars[] = {"~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+"};
        String numbers[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

        
        while( !goodPassword )
        {
            String password = JOptionPane.showInputDialog("Enter preffered password:");
            
            //scan each character in the password
            for (int i = 0; i < password.length(); i++)
            {
                //each character for comparison
                String eachChar = password.substring(i, (i+1));
                
                //scan for non alpha Chars
                for ( int j = 0; j < nonAlphaChars.length; j++)
                {
                   if (eachChar.equals(nonAlphaChars[j]))
                   {
                       hasNonAlpha = true;
                   }
                }
                
                //scan for numbers
                for ( int j = 0; j < numbers.length; j++)
                {
                   if (eachChar.equals(numbers[j]))
                   {
                       hasNumber = true;
                   }
                }
            }
            
            //check what is wrong
            if ( !hasNonAlpha && !hasNumber)
            {
                System.out.println("Sorry, your password requires:\n"
                                    + "a non-alpha character:   ~!@#$%^&*()_+\n"
                                    + "a number:   0123456789");
            }
            else if ( !hasNonAlpha )
            {
                System.out.println("Sorry, your password requires:\n"
                                    + "a non-alpha character:   ~!@#$%^&*()_+");
            }
            else if ( !hasNumber )
            {
                System.out.println("Sorry, your password requires:\n"
                                  + "a number:   0123456789");
            }
            
            //check if both non aplha & number are set for a good password          
            if ( hasNonAlpha && hasNumber )
            {
                goodPassword = true;
            }
            
            //tell them their password was set
            if ( goodPassword )
            {
                System.out.println("You password has been set as: " + password);
            }
        }
    }
}