
package SystemClass;

import java.util.ArrayList;


public class Commitee {
    private String cno;
    private String username;
    private String password;
    private ArrayList<Appointment> allAppointments = new ArrayList<Appointment>();
    private ArrayList<Vaccines> allVaccines = new ArrayList<Vaccines>();
    private ArrayList<People> allPeople = new ArrayList<People>();
    private ArrayList<Commitee> allCommitee = new ArrayList<Commitee>();

    public Commitee(String cno, String username, String password) {
        this.cno = cno;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public ArrayList<Appointment> getAllAppointments() {
        return allAppointments;
    }

    public void setAllAppointments(ArrayList<Appointment> allAppointments) {
        this.allAppointments = allAppointments;
    }

    public ArrayList<Vaccines> getAllVaccines() {
        return allVaccines;
    }

    public void setAllVaccines(ArrayList<Vaccines> allVaccines) {
        this.allVaccines = allVaccines;
    }

    public ArrayList<People> getAllPeople() {
        return allPeople;
    }

    public void setAllPeople(ArrayList<People> allPeople) {
        this.allPeople = allPeople;
    }

    public ArrayList<Commitee> getAllCommitee() {
        return allCommitee;
    }

    public void setAllCommitee(ArrayList<Commitee> allCommitee) {
        this.allCommitee = allCommitee;
    }
    
    public static void CmodifyDetails(){
        SystemDataIO.write();
    }
    
    public static void searchPeople(){
        
    }
    
    public static void PmodifyDetails(){
        SystemDataIO.write();
    }
    
    public static void searchAppointment(){
        
    }
    
    public static void modifyAppointment(){
        SystemDataIO.write();
    }
    
    public static void searchVacSupply(){
        
    }
    
    public static void modifyVacSupply(){
        SystemDataIO.write();
    }
    
    

    }
