import javax.swing.JOptionPane;

public class P1B
{
  public static void main(String[] args)
  {
      int a = 7;
      int b = 2;
      
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
  } // end main method
} // end class MyFirstApp