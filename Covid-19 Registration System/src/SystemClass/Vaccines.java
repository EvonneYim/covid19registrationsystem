package SystemClass;

public class Vaccines {
    private int SupplyID;
    private Centre place;
    private int vacamount;
    private int supplyamount;
    private String condition;

    public Vaccines(int SupplyID, Centre place, int vacamount, int supplyamount, String condition) {
        this.SupplyID = SupplyID;
        Centre c = place;
        this.vacamount = vacamount;
        this.supplyamount = supplyamount;
        this.condition = condition;
    }

    public int getSupplyID() {
        return SupplyID;
    }

    public void setSupplyID(int SupplyID) {
        this.SupplyID = SupplyID;
    }

    public Centre getPlace() {
        return place;
    }

    public void setPlace(Centre place) {
        this.place = place;
    }

    public int getVacAmount() {
        return vacamount;
    }

    public void setVacAmount(int amount) {
        this.vacamount = vacamount;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getSupplyamount() {
        return supplyamount;
    }

    public void setSupplyamount(int supplyamount) {
        this.supplyamount = supplyamount;
    }
       
}
