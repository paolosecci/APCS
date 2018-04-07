import javax.swing.JOptionPane;

public class ClockDriver
{
  public static void main(String[] args )
  {
    //kitchen clock input
    String hourinputk = JOptionPane.showInputDialog("How many hours are there on the kitchen clock?");
    int inputhourk = Integer.parseInt(hourinputk);
    
    String mininputk = JOptionPane.showInputDialog("How many minutes are there on the kitchen clock?");
    int inputmink = Integer.parseInt(mininputk);
    
    String secinputk = JOptionPane.showInputDialog("How many seconds are there on the kitchen clock?");
    int inputseck = Integer.parseInt(secinputk);
    
    //bedroom clock input
    String hourinputb = JOptionPane.showInputDialog("How many hours are there on the bedroom clock?");
    int inputhourb = Integer.parseInt(hourinputb);
    
    String mininputb = JOptionPane.showInputDialog("How many minutes are there on the bedroom clock?");
    int inputminb = Integer.parseInt(mininputb);
    
    String secinputb = JOptionPane.showInputDialog("How many seconds are there on the bedroom clock?");
    int inputsecb = Integer.parseInt(secinputb);
    
    //dining room clock input
    String hourinputd = JOptionPane.showInputDialog("How many hours are there on the dining room clock?");
    int inputhourd = Integer.parseInt(hourinputd);
    
    String mininputd = JOptionPane.showInputDialog("How many minutes are there on the dining room clock?");
    int inputmind = Integer.parseInt(mininputd);
    
    String secinputd = JOptionPane.showInputDialog("How many seconds are there on the dining room clock?");
    int inputsecd = Integer.parseInt(secinputd);
    
    
    
    Clock kitchclock = new Clock( inputhourk, inputmink, inputseck );
    Clock bedclock = new Clock( inputhourb, inputminb, inputsecb );
    Clock dineclock = new Clock( inputhourd, inputmind, inputsecd );
    
    System.out.println(kitchclock);
    System.out.println(bedclock);
    System.out.println(dineclock);
  } //end main method
} //end class