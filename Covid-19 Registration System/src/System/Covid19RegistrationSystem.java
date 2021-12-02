package System;

import SystemClass.Committee;
import SystemClass.People;
import SystemClass.SystemDataIO;

public class Covid19RegistrationSystem {       

    public static CommitteeLogin cfirst = new CommitteeLogin();
    public static CommitteeOperations csecond = new CommitteeOperations();
    public static CommitteeManagement cthird = new CommitteeManagement();
    public static CommitteePeople cfourth = new CommitteePeople();
    public static CommitteeAppointment cfifth = new CommitteeAppointment();
    public static CommitteeVaccines csixth = new CommitteeVaccines();
    
    public static PeopleSignUp pfirst = new PeopleSignUp();
    public static PeopleLogin psecond = new PeopleLogin();
    public static PeopleMainPage pthird = new PeopleMainPage();
    
    public static SystemHomePage main = new SystemHomePage();

    public static Committee clogin;
    public static People plogin;

    public static void main(String[] args) {
        
//        SystemDataIO.read();
        
        main.setVisible(true);
    }

}
