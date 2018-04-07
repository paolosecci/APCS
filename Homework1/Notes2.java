import javax.swing.JOptionPane;

public class Notes2
{
    public static void main(String[] args)
    {
        
        int[] myArr = new int[8];
        
        myArr[0] = 10;
        myArr[1] = -14;
        myArr[2] = 1;
        myArr[6] = 8;
        myArr[7] = 100;
        
        String input = JOptionPane.showInputDialog("What's your Guess?");
        int num = Integer.parseInt(input);
        int numGuesses = 1;
        
        while(num != 73 && numGuesses < 8)
        {
            input = JOptionPane.showInputDialog("Guess Again");
            num = Integer.parseInt(input);
            numGuesses++;
        } //end while
        
        if (num == 73)
        {
        System.out.println("Nobody has ever taken that long before!");
    }
        else
        {
        System.out.println("You stink!");
        }
        
        int sum = 0;
        for (int index = 0; index < myArr.length; index++) // (i++) is the same as (i = i+1)
        {
            if (index != 0)
            {
                myArr[index] = myArr[index - 1] + index;
            }
            else
            {
                myArr[index] = 0;
            }
            
            System.out.println(myArr[index]);
        } //end loop
        
        
        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);
        System.out.println(myArr[5]);
        System.out.println(myArr[6]);
        System.out.println(myArr[7]);
        
        
        
    }
}