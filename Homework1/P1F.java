import javax.swing.JOptionPane;

public class P1F
{
  public static void main(String[] args)
  {
      
      int[] array = new int[50];
      
      for( int index = 0; index < array.length; index++ )
      {
          array[ index ] = (int) (Math.random() * 101);
      } // end for
      
      for( int index = 0; index < array.length; index++ )
      {
         System.out.print(array[ index ] + " ");
      }
      
  } // end main method
} // end class MyFirstApp