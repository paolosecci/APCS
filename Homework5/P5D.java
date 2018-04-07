import javax.swing.JOptionPane;
public class P5D
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog("How many rows?"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("How many colums?"));
        int[][] nums = new int[a][b];
        
        //fill the array
        for (int row = (nums.length - 1); row > 0; row--)
        {
            for (int col = (nums[row].length - 1); col > 0; col--)
            {
                if (row == 0)
                {
                    nums[row][col] = col;
                }
                else if (col == 0)
                {
                    nums[row][col] = row;
                }
                else
                {
                    nums[row][col] = row * col;
                }
            }
        }
        
        //print the array
        for (int row = 0; row < nums.length; row++)
        {
            for (int col = 0; col < nums[row].length; col++)
            {
                System.out.print(nums[row][col] + "\t");
            }
            System.out.println("\n");
        }
    }
}