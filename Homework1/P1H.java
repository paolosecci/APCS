import javax.swing.JOptionPane;

public class P1H
{
  public static void main(String[] args)
  {
      
      String[] musArr = new String[3];
      musArr[0] = "Eminem";
      musArr[1] = "Nas";
      musArr[2] = "Earl";
      
      
      
      for(int index = 0; index < musArr.length; index++)
      {
          System.out.println(musArr[ index ]);
      } // end for
      System.out.print("\n\n");
      
      double c = Math.random();
      if (c < .3333333)
      {
          musArr[0] = "Micheal";
      }
      else if (c > .6666667)
      {
          musArr[2] = "Micheal";
      }
      else
      {
          musArr[1] = "Micheal";
      } // end if
      for(int index = 0; index < musArr.length; index++)
      {
          System.out.println(musArr[ index ]);
      } // end for
      System.out.print("\n\n");
      
      for (int i = 0; i < musArr.length; i++)
      {
          if( musArr[i].equals("Micheal"))
          {
              System.out.println("Micheal is Here!");
          }
          else
          {
              System.out.println("No Micheal in array[" + i + "]");
          }
      }
      
  } // end main method
} // end class MyFirstApp