public class BattingAve
{
    public static void main(String[] args)
    {

        //create array
        double[] batAveArr = new double[9];

        //fill array using for loop
        for ( int i = 0; i < batAveArr.length; i++)
        {
            batAveArr[i] = (Math.random() / 2);
            System.out.println(batAveArr[i]);
        }
        System.out.println( "\n" );
        
        //define highest average
        double highBatAve = 0;
        for ( int i = 0; i < batAveArr.length; i++)
        {
            if (batAveArr[i] > highBatAve)
            {
                highBatAve = batAveArr[i];
            }
        }
        System.out.println( "The best batting average is : " + highBatAve );
    }
}