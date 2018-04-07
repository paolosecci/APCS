public class StudentDriver
{
    public static void main(String[] args)
    {
        Student senior = new Student();
        Student frosh = new Student("Jack", "Hock", false, 99.9, 92.1, 96.22, 102.38, 98.72);
        
        System.out.println(senior);
        
        senior.setGrades(94, 82, 82, 92, 82);
        System.out.println(senior);
        
        System.out.println(frosh);
    }
}