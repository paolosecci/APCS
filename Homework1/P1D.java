import javax.swing.JOptionPane;

public class P1D
{
  public static void main(String[] args)
  {
      for(int i = 1; i <= 10; i++)
      {
          int iSquared = i * i;
          int iRand = (int)(Math.random() * (iSquared - i) + i);
          System.out.println(i + "\t" + iSquared + "\t" + iRand);
      }
  } // end main method
} // end class MyFirstApp

