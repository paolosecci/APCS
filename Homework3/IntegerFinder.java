public class IntegerFinder
{
    public static void main(String[] args)
    {
        int nums[] = {-9, 2, 3, 4, 7, 9, 10, 23, 45, 67};
        
        System.out.println("The original Array is:");
        for(int num: nums)
        {
            System.out.print(num + "\t");
        }
        System.out.println("\n");
        
        int location = -1;
        for( int i = 0; i < nums.length; i++)
        {
            if (9 == nums[i])
            {
                location = i;
            }
        }
        
        
        System.out.println("9 is in element " + location);
    }
}