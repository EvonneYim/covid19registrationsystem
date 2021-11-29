
package SystemClass;

public class Citizen extends People{
    private String icNumber;

    public Citizen(String peopleID, String peopleName, String address, int age, String gender, String mobileNo, String password, String nationality) {
               super(peopleID, peopleName, address, age, gender, mobileNo, password, nationality);
               this.icNumber = peopleID;
    }

    public String getIcNumber() {
        return icNumber;
    }

    public void setIcNumber(String icNumber) {
        this.icNumber = getPeopleID();
    }
    
    
}
