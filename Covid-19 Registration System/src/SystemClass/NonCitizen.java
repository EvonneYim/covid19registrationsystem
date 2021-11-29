
package SystemClass;

public class NonCitizen extends People{
    private String passportNumber;

    public NonCitizen(String peopleID, String peopleName, String address, int age, String gender, String mobileNo, String password, String nationality) {
        super(peopleID, peopleName, address, age, gender, mobileNo, password, nationality);
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = getPeopleID();
    }
    
    
}
