public class MyPodDriver
{
    public static void main(String[] args)
    {
        Song song1 = new Song("Can't Knock the Hustle", "JAY Z", 314, 1996);
        Song song2 = new Song("The World is Yours", "Nas", 177, 1994);
        Song song3 = new Song("Like Toy Soldiers", "Eminem", 257, 2006);
        Song song4 = new Song("Since I've Been Loving You", "LedZ Zeppelin", 326, 1970);
        Song song5 = new Song("Shine on You Crazy Diamond", "Pink Floyd", 10000000, 1975);
        Song song6 = new Song("Cocaine", "Eric Clapton", 217, 1977);
        
        System.out.println("Buy the new ThugPod");
        MyPod ThugPod = new MyPod( "Black", 32,  song1, song2, song3 );
        System.out.println(ThugPod + "\n");
        
        System.out.println("Buy the new PaoloPod");
        MyPod PaoloPod = new MyPod( "White", 64, song4, song5, song6 );
        System.out.println(PaoloPod + "\n");
        
        System.out.println("Buy the new DefaultPod");
        MyPod RominPod = new MyPod();
        System.out.println(RominPod + "\n");
    }
}