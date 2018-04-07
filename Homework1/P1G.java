import javax.swing.JOptionPane;

public class P1G
{
  public static void main(String[] args)
  {
      
      int[] array = new int[10];
      int pos = 0;
      int neg = 0;
      for (int index = 0; index < array.length; index++ )
      {
          array[ index ] = (int) (Math.random() * 101);
          if(Math.random() < .5)
          {
               array[ index ] = array[ index ] * -1;
               neg++;
          }
          else
          {
              pos++;
          }
      } // end for
      int i = 0;
      while (i < array.length)
      {
          System.out.println( array[i]);
          i++;
      }
      
      
      System.out.println("\nThere are " + pos + " positive integers in my array.");
      
      
  } // end main method
} // end class MyFirstApp