import javax.swing.JOptionPane;

public class P1C
{
  public static void main(String[] args)
  {
      int p = 104;
      int evodd = p % 2;
      
      if(evodd == 1)
      {
          System.out.println(p + " is an odd number.");
      }
      else
      {
          System.out.println(p + " is an even number.");
      }
  } // end main method
} // end class MyFirstApp

