package System;

import SystemClass.Committee;
import SystemClass.People;
import SystemClass.SystemDataIO;

public class Covid19RegistrationSystem {       

    public static CommitteeLogin cfirst;
    public static CommitteeOperations csecond;
    public static CommitteeManagement cthird;
    public static CommitteePeople cfourth;
    public static CommitteeAppointment cfifth;
    public static CommitteeVaccines csixth;
    
    public static PeopleSignUp pfirst;
    public static PeopleLogin psecond;
    public static PeopleMainPage pthird;
    public static PeopleRegisterAppointment pfourth;
    
    public static SystemHomePage main;

    public static Committee clogin;
    public static People plogin;

    public static void main(String[] args) {
        
//        SystemDataIO.read();
        
        cfirst = new CommitteeLogin();
        csecond = new CommitteeOperations();
        cthird = new CommitteeManagement();
        cfourth = new CommitteePeople();
        cfifth = new CommitteeAppointment();
        csixth = new CommitteeVaccines();
        
        pfirst = new PeopleSignUp();
        psecond = new PeopleLogin();
        pthird = new PeopleMainPage();
        pfourth = new PeopleRegisterAppointment();
        
        main = new SystemHomePage();
        
        main.setVisible(true);
    }

}
