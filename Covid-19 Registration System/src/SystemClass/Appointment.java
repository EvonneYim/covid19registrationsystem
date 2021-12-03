package SystemClass;

import System.CommitteeManagement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Appointment implements AutoNumber{

    private String appointmentID;
    private String appointmentDate;
    private String appointmentTime;
    private int dose;
    private String appointmentStatus;
    private String vaccinationStatus;
    private People ppl;
    private Centre place;

    public Appointment(People ppl, String appointmentDate, String appointmentTime, int dose,
            Centre place, String appointmentStatus, String vaccinationStatus) {    //this want is without app_ID
        this.appointmentID = AutoNumber();
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.dose = dose;
        this.appointmentStatus = appointmentStatus;
        this.vaccinationStatus = vaccinationStatus;
        this.place = place;
        this.ppl = ppl;

    }

    public Appointment(People ppl, String appointmentDate, String appointmentTime, int dose,
            Centre place, String appointmentStatus, String vaccinationStatus, String appointmentID) {        //poly exits here
        this.appointmentID = appointmentID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.dose = dose;
        this.appointmentStatus = appointmentStatus;
        this.vaccinationStatus = vaccinationStatus;
        this.place = place;
        this.ppl = ppl;

    }

    public Appointment() {

    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public String getVaccinationStatus() {
        return vaccinationStatus;
    }

    public void setVaccinationStatus(String vaccinationStatus) {
        this.vaccinationStatus = vaccinationStatus;
    }

    public Centre getPlace() {
        return place;
    }

    public void setPlace(Centre place) {
        this.place = place;
    }

    public People getPpl() {
        return ppl;
    }

    public void setPpl(People ppl) {
        this.ppl = ppl;
    }

    public String AutoNumber() {
        DecimalFormat df = new DecimalFormat("00000");
        try {
            String filepath = "Appointment.txt";
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            String LastRecord = "", temp;

            while ((temp = br.readLine()) != null) {
                LastRecord = temp;
            }

            String finalapp = "A00001";

            if (!LastRecord.equals("")) {
                String[] lastrec = LastRecord.split(";");
                String lastapp = lastrec[2];

                String appNumber = lastapp.substring(1);

                int newapp = Integer.parseInt(appNumber) + 1;
                String prefix = "A";
                finalapp = prefix + df.format(newapp);
            }

            fr.close();
            br.close();

            return finalapp;

        } catch (IOException ex) {
            Logger.getLogger(CommitteeManagement.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
