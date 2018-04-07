import javax.swing.JOptionPane;

public class Notes1
{
  public static void main(String[] args)
  {
      int a = 0;
      int b = 0;
      
      if(a < b)
      {
          System.out.println("The value of a is " + a + " and it is less than b whose value is " + b);
      }
      else if(a > b)
      {
          System.out.println("The value of a is " + a + " and it is greater than b whose value is " + b);
      }
      else
      {
          System.out.println("The value of a is " + a + " and it is equal to the value of b");
      }
      
      
      
      int p = 17;
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
