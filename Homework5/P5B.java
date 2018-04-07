public class P5B
{
    public static void main(String[] args)
    {
        int[][] nums = new int[4][5];
        
        //fill the array with ints from 1-20 (in order)
        System.out.println("This is nums:");
        for (int row = 0; row < nums.length; row++)
        {
            for (int col = 0; col < nums[row].length; col++)
            {
                nums[row][col] = col + (row * nums[row].length) + 1;
                System.out.print(nums[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        
        //sum up all the elements
        int sum = 0;
        for (int row = 0; row < nums.length; row++)
        {
            for (int col = 0; col < nums[row].length; col++)
            {
                 sum += nums[row][col] ;
            }
        }
        System.out.println("This is the sum of everything in the array:\t" + sum + "\n");
        
        //sum each row
        System.out.println("ROWS:");
        for (int row = 0; row < nums.length; row++)
        {
            sum = 0;
            for (int col = 0; col < nums[row].length; col++)
            {
                 sum += nums[row][col] ;
            }
            System.out.println("row " + (row + 1) + " has a sum of: " + sum);
        }
        System.out.println();
        
        //sum each col
        System.out.println("COLUMNS:");
        int colCount = 1;
        for (int row = 0; row < nums[0].length; row++)
        {
            sum = 0;
            for (int col = 0; col < nums.length; col++)
            {
                 sum += nums[col][row];
            }
            System.out.println("col " + colCount + " has a sum of: " + sum);
            colCount++;
        }
        
    }
}