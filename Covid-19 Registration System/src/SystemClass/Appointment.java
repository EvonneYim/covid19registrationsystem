
package SystemClass;

public class Appointment {
    private int appointmentID;
    private int appointmentDate;
    private int appointmentTime;
    private int dose;
    private String appointmentStatus;
    private String vaccinationStatus;
    private People ppl;
    private Centre place;
    
    private String PeopleID = ppl.getPeopleID();
    private String PeopleName = ppl.getPeopleName();

    public Appointment(String PeopleID, String PeopleName, int appointmentID, int appointmentDate, int appointmentTime, int dose, 
             Centre place, String appointmentStatus, String vaccinationStatus) {
        this.appointmentID = appointmentID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.dose = dose;
        this.appointmentStatus = appointmentStatus;
        this.vaccinationStatus = vaccinationStatus;
        Centre centre = place;
        this.PeopleID = PeopleID;
        this.PeopleName = PeopleName;
        
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public int getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(int appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public int getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(int appointmentTime) {
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

    public String getPeopleID() {
        return PeopleID;
    }

    public void setPeopleID(String PeopleID) {
        this.PeopleID = PeopleID;
    }

    public String getPeopleName() {
        return PeopleName;
    }

    public void setPeopleName(String PeopleName) {
        this.PeopleName = PeopleName;
    }
    
}
