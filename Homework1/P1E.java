import javax.swing.JOptionPane;

public class P1E
{
  public static void main(String[] args)
  {
      String[] movieArr = new String[3];
      movieArr[0] = "The Dark Knight";
      movieArr[1] = "The Gladiator";
      movieArr[2] = "Forrest Gump";
      
      String[] songArr = new String[3];
      songArr[0] = "Like Toy Soldiers";
      songArr[1] = "Born Sinner";
      songArr[2] = "Young Forever";
      
      
      System.out.println("These are my favorite movies:");
      for(int index = 0; index < movieArr.length; index++)
      {
          System.out.println(movieArr[ index ]);
      } // end for
      System.out.println("\n\n");
      
      
      System.out.println("These are my favorite songs:");
      int index = 0;
      while( index < songArr.length - 1 )
      {
          System.out.print(songArr[ index ] + ", ");
          index++;
      } // end while
      while (index == songArr.length - 1)
      {
          System.out.print("and " + songArr [ index ]);
          index++;
      } // end while
      
  } // end main method
} // end class MyFirstApp

