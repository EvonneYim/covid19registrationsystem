package SystemClass;

import System.CommitteeManagement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Vaccines {
    private String SupplyID;
    private Centre place;
    private int supplyamount;
    
    public Vaccines(Centre place, int supplyamount,String SupplyID) {
        this.SupplyID = SupplyID;
        this.place = place;
        this.supplyamount = supplyamount;
    }
    
    public Vaccines(Centre place, int supplyamount) {
        this.SupplyID = AutoNumber();
        this.place = place;
        this.supplyamount = supplyamount;
    }
    
    public Vaccines(){
        
    }

    public String getSupplyID() {
        return SupplyID;
    }

    public void setSupplyID(String SupplyID) {
        this.SupplyID = SupplyID;
    }

    public int getSupplyamount() {
        return supplyamount;
    }

    public void setSupplyamount(int supplyamount) {
        this.supplyamount = supplyamount;
    }

    public Centre getPlace() {
        return place;
    }

    public void setPlace(Centre place) {
        this.place = place;
    }
    
    public String AutoNumber() {
        DecimalFormat df = new DecimalFormat("00000");
        try {
            String filepath = "Vaccines.txt";
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            String LastRecord = "", temp;

            while ((temp = br.readLine()) != null) {
                LastRecord = temp;
            }
            
            String finalapp = "S00001";
            
            if (!LastRecord.equals("")) {
                String[] lastrec = LastRecord.split(";");
                String lastapp = lastrec[0];

                String appNumber = lastapp.substring(1);

                int newapp = Integer.parseInt(appNumber) + 1;
                String prefix = "S";
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
