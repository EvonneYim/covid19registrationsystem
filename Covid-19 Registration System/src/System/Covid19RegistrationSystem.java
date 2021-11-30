package System;

import SystemClass.Commitee;
import SystemClass.People;
import SystemClass.SystemDataIO;

public class Covid19RegistrationSystem {       

    public static CommiteeLogin cfirst;
    public static CommiteeOperations csecond;
    public static CommiteeManagement cthird;
    public static CommiteePeople cfourth;
    public static CommiteeAppointment cfifth;
    public static CommiteeVaccines csixth;
    
    public static Signup pfirst;
    public static Login psecond;
    public static Main_Page pthird;
    public static Register_Appointment pfourth;
    
    public static Home_Page main;

    public static Commitee clogin;
    public static People plogin;

    public static void main(String[] args) {
        
//        SystemDataIO.read();
        
        cfirst = new CommiteeLogin();
        csecond = new CommiteeOperations();
        cthird = new CommiteeManagement();
        cfourth = new CommiteePeople();
        cfifth = new CommiteeAppointment();
        csixth = new CommiteeVaccines();
        
        pfirst = new Signup();
        psecond = new Login();
        pthird = new Main_Page();
        pfourth = new Register_Appointment();
        
        main = new Home_Page();
        
        main.setVisible(true);
    }

}
