public class StudentDriver
{
    public static void main(String[] args)
    {
        Student senior001 = new Student();
        Student frosh001 = new Student("Jack", "Hock", 4.11, false);
        
        System.out.println(senior001);
        System.out.println(frosh001);
    }
}