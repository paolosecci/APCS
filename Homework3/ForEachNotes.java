public class ForEachNotes
{
    public static void main(String[] args)
    {
        String[] words = {"cool", "mom", "face", "babes", "turnt"};
        
        for( int i = 0; i < words.length; i++)
        {
            System.out.println(words[i]);
        }
        
        System.out.println();
        
        for(String word: words)
        {
            System.out.println(word);
        }
    }
}