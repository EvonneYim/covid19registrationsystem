package SystemClass;

import java.util.ArrayList;

public class People {

    private String peopleID;
    private String peopleName;
    private String address;
    private int age;
    private String gender;
    private String mobileNo;
    private String password;
    private String nationality;
    private ArrayList<Appointment> myAppointment = new ArrayList<Appointment>();

    public People(String peopleID, String peopleName, String address, int age, String gender, String mobileNo, String password, String nationality) {
        this.peopleID = peopleID;
        this.peopleName = peopleName;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.mobileNo = mobileNo;
        this.password = password;
        this.nationality = nationality;
    }

    public People(String peopleID, String peopleName) { 
        this.peopleID = peopleID;
        this.peopleName = peopleName;
    }

    public String getPeopleID() {
        return peopleID;
    }

    public void setPeopleID(String peopleID) {
        this.peopleID = peopleID;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public ArrayList<Appointment> getMyAppointment() {
        return myAppointment;
    }

    public void setMyAppointment(ArrayList<Appointment> myAppointment) {
        this.myAppointment = myAppointment;
    }

    public static void PmodifyDetails() {
        SystemDataIO.write();
    }

    public static void viewDetails() {
        SystemDataIO.read();
    }

    public static void makeAppointment() {
        SystemDataIO.write();
    }

    public static void cancelAppointment() {
        SystemDataIO.write();
    }

    public static void viewAppointment() {
        SystemDataIO.read();
    }

}
