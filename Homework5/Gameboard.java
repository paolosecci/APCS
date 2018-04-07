import javax.swing.JOptionPane;
public class Gameboard
{
    public static void main(String[] args)
    {
        //get the arrays size from user
        int rows = Integer.parseInt(JOptionPane.showInputDialog("Enter number of rows:"));
        int cols = Integer.parseInt(JOptionPane.showInputDialog("Enter number of column:"));

        //create the array
        int gameboard[][] = new int[rows][cols];

        //fill board w rand #s from 1-100
        for (int row = 0; row < gameboard.length; row++)
        {
            for (int col = 0; col < gameboard[row].length; col++)
            {
                gameboard[row][col] = (int) ((Math.random() * 100) + 1);
            }
        }

        //fill a random spot w zero
        int randRow = (int) (Math.random() * rows);
        int randCol = (int) (Math.random() * cols);
        gameboard[randRow][randCol] = 0;

        //print the array with hidden values
        for (int row = 0; row < gameboard.length; row++)
        {
            for (int col = 0; col < gameboard[row].length; col++)
            {
                System.out.print("X\t");
            }
            System.out.println("\n\n");
        }

        //count there attempts
        int attempt = 1;

        //check if the zero is there
        int r;
        int c;
        if (gameboard[r = Integer.parseInt(JOptionPane.showInputDialog("Guess the row corresponding to the locatoin of the ZERO:"))][c = Integer.parseInt(JOptionPane.showInputDialog("Guess the column corresponding to the locatoin of the ZERO:"))] != 0)
        {
            int rowsOff = Math.abs(randRow - r);
            int colsOff = Math.abs(randCol - c);

            System.out.println
            ("Missed!\n" +
                "You were off by " + rowsOff + " rows\n" +
                "You were off by " + colsOff + " columns\n"
            );

            //reveal the number
            for (int row = 0; row < gameboard.length; row++)
            {
                for (int col = 0; col < gameboard[row].length; col++)
                {
                    if (row == r && col == c)
                    {
                        System.out.print(gameboard[row][col] + "\t");
                    }
                    else
                    {
                        System.out.print("X\t");
                    }
                }
                System.out.println("\n\n");
            }

            attempt++;
        }
        else
        {
            //tell them they got it right
            System.out.println("You Found the Zero!");
            System.out.println("it took you " + attempt + " attempts to find it.");
        }
    }
}