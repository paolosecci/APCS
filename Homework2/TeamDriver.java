public class TeamDriver
{
    public static void main(String[] args)
    {
        Team team1 = new Team();
        Team team2 = new Team( "Vikings" , "Minnesota" , 0 , "NFL" );
        
        System.out.println(team1);
        System.out.println(team2);
    }
}