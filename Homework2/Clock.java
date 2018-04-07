public class Clock
   {
   //1. create instance variables
   private int hour;
   private int min;
   private int sec;
   private double cost;
   private String brand;
   private boolean isOn;
   
   
   //2. write constructor to initialize instance variables
   public Clock()
   {
       hour = hour;
       hour = min;
       hour = sec;
   }//end constructor
   
   public Clock( int hourinput, int mininput, int secinput)
   {
       hour = hourinput;
       min = mininput;
       sec = secinput;
   }
   
   //3. toString()
   public String toString()
   {
       String returnString = "The time on the clock reads ";
       if (hour < 10)
       {
           returnString += "0";
       }
       returnString += hour + ":";
       if (hour >= 24)
       {
           returnString = "Impossible Time: hour can't be 24 or up\t";
       }
       
       if (min < 10)
       {
           returnString += "0";
       }
       returnString += min + ":";
       if (min >= 60)
       {
           returnString = "\tImpossible Time: minutes can't be 60 or up\t";
       }
       
       if (sec < 10)
       {
           returnString += "0";
       }
       returnString += sec;
       if (sec >= 60)
       {
           returnString = "\tImpossible Time: seconds can't be 60 or up";
       }
       
       return returnString;
   }
   
   }