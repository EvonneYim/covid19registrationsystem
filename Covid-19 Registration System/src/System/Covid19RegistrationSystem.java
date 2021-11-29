package System;

import SystemClass.Commitee;
import SystemClass.SystemDataIO;

public class Covid19RegistrationSystem {        //public static got prob

    public static CommiteeLogin first;
    public static CommiteeOperations second;
    public static CommiteeManagement third;
    public static CommiteePeople fourth;
    public static CommiteeAppointment fifth;
    public static CommiteeVaccines sixth;

    public static Commitee login;

    public static void main(String[] args) {
        
//        SystemDataIO.read();
        
        first = new CommiteeLogin();
        second = new CommiteeOperations();
        third = new CommiteeManagement();
        fourth = new CommiteePeople();
        fifth = new CommiteeAppointment();
        sixth = new CommiteeVaccines();
        
        first.setVisible(true);
    }

}
