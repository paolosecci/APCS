public class Practice
{
    public static void main(String[] args)
    {
        String[] songarray = new String[5];
        String[] artistarray = new String[5];
        int[] tracknumarray = new int[5];
        String[] albumarray = new String[5];
        
        songarray[0] = "Black Magic Woman";
        songarray[1] = "Dead Presidents II";
        songarray[2] = "N.Y. State of Mind";
        songarray[3] = "Welcome to the Jungle";
        songarray[4] = "Rebel Without a Cause";
        
        artistarray[0] = "Santana";
        artistarray[1] = "JAY Z";
        artistarray[2] = "Nas";
        artistarray[3] = "Guns n' Roses";
        artistarray[4] = "Public Enemy";
        
        tracknumarray[0] = 1;
        tracknumarray[1] = 9;
        tracknumarray[2] = 2;
        tracknumarray[3] = 5;
        tracknumarray[4] = 13;
        
        albumarray[0] = "Greatest Hits";
        albumarray[1] = "Reasonable Doubt";
        albumarray[2] = "Illmatic";
        albumarray[3] = "Appetite For Disaster";
        albumarray[4] = "It Takes a Nation of A Million to Hold Us Back";
        
        for(int index = 0; index < songarray.length; index++)
        {
            System.out.println("The song is \"" + songarray[index] + "\" by " +
                                artistarray[ index ] + " which is track number "
                                + tracknumarray[ index ] + " off the album " +
                                albumarray[ index ] + ".");
        }
        
        
        
    }// end main method
}