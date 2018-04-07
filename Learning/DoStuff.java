public class DoStuff
{
    private int length;
    private int width;
    
    public DoStuff(int[] array)
    {
        
    }
    
    public int[] sort(int[] array)
    {
        int min = 0;
        int spot = 0;
        int[] out = array;
        
        for( int i = 0; i < array.length-1; i++)
        {
            min = array[i];
            spot = i;
            for (int j = i++; j < array.length; j++)
            {
                if (min > array[j])
                {
                    min = array[j];
                    spot = j;
                }
            }
            array[spot] = array[i];
            array[i] = min;
        }
        
        return out;
    }
}