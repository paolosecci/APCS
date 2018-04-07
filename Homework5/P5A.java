public class P5A
{
    public static void main(String[] args)
    {
        int[][] randomNums = new int[3][4];
        int a = 5;
        
        //fill array w random ints 0-10
        for (int row = 0; row < randomNums.length; row++)
        {
            for (int col = 0; col < randomNums[row].length; col++)
            {
             randomNums[row][col] = (int) (Math.random() * 11);    
             System.out.print(randomNums[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        
        //scan for int a
        System.out.println( "Location of the " + a + "'s:");
        for (int row = 0; row < randomNums.length; row++)
        {
            for (int col = 0; col < randomNums[row].length; col++)
            {
             if (randomNums[row][col] == a)
             {
                 System.out.println("(" + row + ", " + col + ")");
             }
            }
        }
    }
}