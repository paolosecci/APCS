public class RunShit
{
    public static void main(String[] args)
    {
        //create numbers array
        int[] numbers = new int[10];
        
        //fill numbers w rand from 0-10
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = (int) (Math.random() * 11);
        }
        
        //print original array
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i] + "\t");
        }
        System.out.println();
        
        //sort array
        DoStuff.sort(numbers);
        
        //print sorted array
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i] + "\t");
        }
    }
}