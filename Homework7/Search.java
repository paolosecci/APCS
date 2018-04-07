import javax.swing.JOptionPane;
public class Search
{
    //linearSearch()
    public static int linearSearch(int[] arr, int key)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == key)
            {
                return i;
            }
        }

        return -1;
    }

    //selectionSearch()
    public static void selectionSearch(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int minimum = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[minimum])
                {
                    minimum = j;
                }
            }
            
            swap(arr, i, minimum);
        }
    }
    
    //swap()
    public static void swap(int[] a, int p, int q)
    {
        int temp = a[p];
        a[p] = a[q];
        a[q] = temp;
    }
    
    
    
    
    
    //mainMethod
    public static void main(String[] args)
    {
        int[] array = {3, 8, -1};
        int key = Integer.parseInt(JOptionPane.showInputDialog("What's the key?"));
        int index = 0;
        boolean found = false;

        while (index < array.length && !found)
        {
            if (array[index] == key)
            {
                found = true;
            }
            else
            {
                index++;
            }
        }

        if (found)
        {
            System.out.println(key + " is at index " + index);
        }
        else
        {
            System.out.println("Shit ain't here kuh");
        }
    }

}