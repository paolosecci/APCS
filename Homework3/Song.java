import javax.swing.JOptionPane;

public class Song
{
    //define variables
    private String title;
    private String artist;
    private int yearReleased;
    private int sec;
    private boolean isFire;

    //5 arg constructor
    public Song(String title, String artist, int yearReleased, int sec, boolean isFire)
    {
        this.title = title;
        this.artist = artist;
        this.yearReleased = yearReleased;
        this.sec = sec;
        this.isFire = isFire;
    }

    //default constructor
    public Song()
    {
        this.title = "99 Problems";
        this.artist = "JAY Z";
        this.yearReleased = 2004;
        this.sec = 234;
        this.isFire = true;
    }

    //getters and setters
    public int getYearReleased()
    {
        return yearReleased;
    }// end year getter
    public void setYearReleased(int yearReleased)
    {
        if (this.checkPassword())
        {
            this.yearReleased = yearReleased;
        }
        else
        {
            System.out.println("You failed to log in, so the year released was NOT changed.\n");
        }
    }// end year setter

    //convert to minSec
    public String convertToMinSec()
    {
        int min = this.sec / 60;
        int sec = min % this.sec;
        String returnMin = "";
        String returnSec = "";
        
        if (min < 10)
        {
            returnMin = "0";
            returnMin += min;
        }
        if (sec < 10)
        {
            returnSec = "0";
            returnSec += sec;
        }
        
        return (returnMin + ":" + returnSec);
    }

    //check password
    public boolean checkPassword()
    {
        int guessLimit = 4;
        int guessCount = 0;
        boolean isSuccessful = false;

        while(guessCount < guessLimit && !isSuccessful)
        {
            String usernameInput = JOptionPane.showInputDialog("Please enter your username:");
            int passwordIntInput = Integer.parseInt(JOptionPane.showInputDialog("Enter your password"));

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

        return isSuccessful;
    }

    //return using toString()
    public String toString()
    {
        String returnString =
            "The song \"" + title + "\" by " + artist + ", released in " +
            yearReleased + " has length " + convertToMinSec() + ".\nIt ";
        if(isFire)
        {
            returnString += "is";
        }
        else
        {
            returnString += "is NOT";
        }
        returnString += " fire.";

        return returnString;
    }
}