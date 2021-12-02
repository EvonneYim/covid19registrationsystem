
package SystemClass;

public class CentreVaccines {
    Centre centre;
    int vacamount;

    public CentreVaccines(Centre centre, int vacamount) {
        this.centre = centre;
        this.vacamount = vacamount;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    public int getVacamount() {
        return vacamount;
    }

    public void setVacamount(int vacamount) {
        this.vacamount = vacamount;
    }
}
