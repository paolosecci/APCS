import javax.swing.JOptionPane;
public class PasswordSuperAnnoyance
{
    public static void main(String[] args)
    {
        boolean goodPassword = false;
        boolean hasNumber = false;
        boolean hasNonAlpha = false;
        boolean hasLastName = true;
        String nonAlphaChars[] = {"~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+"};
        String numbers[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

        String lastname = JOptionPane.showInputDialog("Enter your last name:");

        while( !goodPassword )
        {
            String password = JOptionPane.showInputDialog("Enter preffered password:");

            //scan each character in the password
            for (int i = 0; i < password.length(); i++)
            {
                //each character for comparison
                String eachChar = password.substring(i, (i+1));

                //scan for non alpha Chars
                if ( !hasNonAlpha )
                {
                    for (int j = 0; j < nonAlphaChars.length; j++)
                    {
                        if (eachChar.equals(nonAlphaChars[j]))
                        {
                            hasNonAlpha = true;
                        }
                    }
                }

                //scan for numbers
                if ( !hasNumber )
                {
                    for (int j = 0; j < numbers.length; j++)
                    {
                        if (eachChar.equals(numbers[j]))
                        {
                            hasNumber = true;
                        }
                    }
                }

                //scan for last name
                if ( hasLastName )
                {
                    int count = 0;
                    if ( password.substring(i, (i+1)).equals(lastname.substring(0, (1))))
                    {
                        for (int j = i; j < (i + lastname.length()); j++)
                        {
                            if (!(password.substring(j, (j+1)).equals(lastname.substring((j-i), (j-i+1)))))
                            {
                                count = 0;
                                j += lastname.length();
                            }
                            else
                            {
                                count++;
                            }
                        }
                        if (count == 0)
                        {
                            hasLastName = false;
                            i += password.length();
                        }
                    }
                }
            }

            //check what is wrong
            if ( !hasNonAlpha && !hasNumber && hasLastName)
            {
                System.out.println("Sorry, your password requires:\n"
                    + "a non-alpha character:   ~!@#$%^&*()_+\n"
                    + "a number:   0123456789\n"
                    + "can't have last name in password");
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
            else if ( hasLastName )
            {
                System.out.println("Sorry, your password requires:\n"
                    + "can't have last name in password");
            }

            //check if both non aplha , no name, & number are set for a good password          
            if ( hasNonAlpha && hasNumber && !hasLastName )
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