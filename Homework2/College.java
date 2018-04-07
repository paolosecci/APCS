public class College
{
    public static void main(String[] args)
    {
        //fill collegeArr
        String[] collegeArr = new String[7];
        collegeArr[0] = "Berkley";
        collegeArr[1] = "UCLA";
        collegeArr[2] = "UCSB";
        collegeArr[3] = "Cal Poly SLO";
        collegeArr[4] = "Santa Clara";
        collegeArr[5] = "Northwestern";
        collegeArr[6] = "SMC";

        //define shortest college name variables
        int shortest = 100;
        String shortestName = "";
        for ( int i = 0; i < collegeArr.length; i++)
        {
            String name = new String( collegeArr[i] );
            System.out.println(collegeArr[i] + "\t" + name.length() );
            if (name.length() < shortest)
            {
                shortest = name.length();
                shortestName = collegeArr[i];
            }
        }
        System.out.println("\n");
        System.out.println("The shortest college name is: " + shortestName);

        //remove element and fill with null
        collegeArr[3] = null;
        System.out.println("\n");
        
        //print new array using for loop
        for ( int i = 0; i < collegeArr.length; i++)
        {
            System.out.println(collegeArr[i]);
        }
    }
}