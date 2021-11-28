package CommiteeSystem;

import SystemClass.Commitee;
import SystemClass.SystemDataIO;

public class Covid19RegistrationSystem {        //public static got prob
    public static CommiteeLogin first = new CommiteeLogin();
    public static CommiteeOperations second = new CommiteeOperations();
    public static CommiteeManagement third = new CommiteeManagement();
    public static CommiteePeople fourth = new CommiteePeople();
    public static CommiteeAppointment fifth = new CommiteeAppointment();
    public static CommiteeVaccines sixth = new CommiteeVaccines();
    
    public static Commitee login;
   
    
    public static void main(String[] args) {
          first.setVisible(true);
//          SystemDataIO.read();              //might have prob here as well
    }
    
}
