public class RightTriangleDriver
{
    public static void main(String[] args)
    {
        RightTriangle triangle1 = new RightTriangle();
        System.out.println(triangle1 + "\n");
        
        RightTriangle triangle2 = new RightTriangle(3, 4);
        System.out.println(triangle2 + "\n");
        
        triangle2.setBase(6);
        System.out.println(triangle2);
    }
}
