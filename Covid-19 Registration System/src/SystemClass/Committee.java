
package SystemClass;

import System.CommitteeManagement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Committee implements AutoNumber{
    private String cno;
    private String username;
    private String password;
    private ArrayList<Appointment> allAppointments = new ArrayList<Appointment>();
    private ArrayList<Vaccines> allVaccines = new ArrayList<Vaccines>();
    private ArrayList<People> allPeople = new ArrayList<People>();
    private ArrayList<Committee> allCommitee = new ArrayList<Committee>();

    public Committee(String cno, String username, String password) {
        this.cno = cno;
        this.username = username;
        this.password = password;
    }
    
    public Committee(){
        
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

    public ArrayList<Committee> getAllCommitee() {
        return allCommitee;
    }

    public void setAllCommitee(ArrayList<Committee> allCommitee) {
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
    
    public String AutoNumber() {
        DecimalFormat df = new DecimalFormat("000");
        try {
            String filepath = "Commitee.txt";
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            String LastRecord = "", temp;

            while ((temp = br.readLine()) != null) {
                LastRecord = temp;
            }
             String finalcno = "C001";
            
            if (!LastRecord.equals("")) {
                String[] lastrec = LastRecord.split(";");
                String lastcno = lastrec[0];

                String cnoNumber = lastcno.substring(1);

                int newapp = Integer.parseInt(cnoNumber) + 1;
                String prefix = "C";
                finalcno = prefix + df.format(newapp);
            }
            fr.close();
            br.close();

            return finalcno;

        } catch (IOException ex) {
            Logger.getLogger(CommitteeManagement.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }}
    

    }
