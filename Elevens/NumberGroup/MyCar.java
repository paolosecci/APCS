public class MyCar extends Vehicle
{
    private String color;
    private String make;
    private String model;
    private int year;
    
    public MyCar()
    {
        super(2);
        color = "White";
        make = "Toyota";
        model = "Yaris";
        year = 2008;
    }//default car
    
    public MyCar(String coloro, String makeo, String modelo, int yearo)
    {
        color = coloro;
        make = makeo;
        model = modelo;
        year = yearo;
    }//car constructor
    
    String toString()
    {
        String out = super.toString();
        out += year + " " + color + " " + make + " " + model;
        return out;
    }
}