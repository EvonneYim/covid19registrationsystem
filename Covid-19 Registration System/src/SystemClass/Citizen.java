
package SystemClass;

public class Citizen extends People{
    private int icNumber;

    public Citizen(String peopleID, String peopleName, String address, int age, String gender, String mobileNo, String password, String nationality, int icNumber) {
               super(peopleID, peopleName, address, age, gender, mobileNo, password, nationality);
               this.icNumber = icNumber;
    }

    public int getIcNumber() {
        return icNumber;
    }

    public void setIcNumber(int icNumber) {
        this.icNumber = icNumber;
        icNumber = Integer.parseInt(getPeopleID());
    }
    
    
}
