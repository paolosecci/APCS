//PAOLO SECCI
import javax.swing.JOptionPane;

public class Test1
{
    public static void main(String[] args)
    {
        //get inputs
        String lengthinput = JOptionPane.showInputDialog("Please enter length:");
        int arrSize = Integer.parseInt(lengthinput);
        String boundinput = JOptionPane.showInputDialog("Please enter boundaries:");
        int bound = Integer.parseInt(boundinput);

        //define arrays
        int[] nums = new int[arrSize];
        int[] biggerNums = new int[arrSize];

        //fill nums array w for loop
        for ( int i = 0; i < nums.length; i++)
        {
            int randomNum = (int) (Math.random() * (bound + 1));
            nums[i] = randomNum;
        }

        //define last number in the array "nums"
        int lastnum = nums[(nums.length - 1)];

        //fill biggerNums array w for loop
        for ( int i = 0; i < nums.length; i++)
        {
            int biggerNum_i = nums[i] + lastnum;
            biggerNums[i] = biggerNum_i;
        }

        //define running total
        int sum = 0;

        //print column headers
        System.out.println("Number\tBigger\tRunning Total");

        //fill running total + print
        for ( int i = 0; i < nums.length; i++)
        {
            //fill running total
            int evenodd = biggerNums[i] % 2;
            if ( evenodd == 1 )
            {
                
            }
            else
            {
                sum = biggerNums[i] + sum; // alt way:     sum += biggerNums[i];
            }
            //print nums, biggernums, and sum
            System.out.println(nums[i] + "\t" + biggerNums[i] + "\t" + sum);
        }

    }
}