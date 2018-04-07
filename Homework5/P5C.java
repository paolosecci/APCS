public class P5C
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 10;
        int[][] multTable = new int[a][b];
        
        //fill the array
        for (int row = 0; row < multTable.length; row++)
        {
            for (int col = 0; col < multTable[row].length; col++)
            {
                if (row == 0)
                {
                    multTable[row][col] = col;
                }
                else if (col == 0)
                {
                    multTable[row][col] = row;
                }
                else
                {
                    multTable[row][col] = row * col;
                }
            }
        }
        
        //print the array
        for (int row = 0; row < multTable.length; row++)
        {
            for (int col = 0; col < multTable[row].length; col++)
            {
                System.out.print(multTable[row][col] + "\t");
            }
            System.out.println("\n");
        }
    }
}