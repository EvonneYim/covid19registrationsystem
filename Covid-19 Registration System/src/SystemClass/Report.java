
package SystemClass;

import static SystemClass.SystemDataIO.allAppointments;
import static SystemClass.SystemDataIO.allCentreVaccines;
import static SystemClass.SystemDataIO.allPeople;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Report {
    
    public class AppointmentCount{
        private String place;
        private int total;
        private int complete;
        private int incomplete;
        private int vacamount;

        public AppointmentCount(String place, boolean isComplete) {
            this.place = place;
            this.total = 1;         //must be initiated as 1, cuz already got existing record
            
            if(isComplete){
                complete = 1;
                incomplete = 0;
            }else{
                complete = 0;
                incomplete = 1;
            }
            
            for(int i =0; i< allCentreVaccines.size(); i++){
                if(allCentreVaccines.get(i).getCentre().toString().equals(place)){
                   vacamount =allCentreVaccines.get(i).getVacamount();
                }
            }
            
        }
        
        public AppointmentCount(String place){
            this.place = place;
            this.total =0;
            this.complete =0;
            this.incomplete=0;
            
            for(int i =0; i< allCentreVaccines.size(); i++){
                if(allCentreVaccines.get(i).getCentre().toString().equals(place)){
                   vacamount =allCentreVaccines.get(i).getVacamount();
                }
            }
        }

        public int getVacamount() {
            return vacamount;
        }

        public void setVacamount(int vacamount) {
            this.vacamount = vacamount;
        }
       
        
        public int getComplete() {
            return complete;
        }

        public void setComplete(int complete) {
            this.complete = complete;
        }

        public int getIncomplete() {
            return incomplete;
        }

        public void setIncomplete(int incomplete) {
            this.incomplete = incomplete;
        }

        
        public String getPlace() {
            return place;
        }

        public void setPlace(String place) {
            this.place = place;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

    }
    
    private static ArrayList<People> pplrecords = new ArrayList<People>();
    private int registered_ppl =0;
    private int registered_male =0;
    private int registered_female =0;
    private int registered_citizen =0;
    private int registered_ncitizen =0;
    
    private static ArrayList<Appointment> apprecords = new ArrayList<Appointment>();
    private int tot_app =0;
    private String appDetails;
    
    private static ArrayList<CentreVaccines> centrevacrecords = new ArrayList<CentreVaccines>();

    public static ArrayList<People> getPplrecords() {
        return pplrecords;
    }

    public int getRegistered_ppl() {
        return registered_ppl;
    }

    public int getRegistered_male() {
        return registered_male;
    }

    public int getRegistered_female() {
        return registered_female;
    }

    public int getRegistered_citizen() {
        return registered_citizen;
    }

    public int getRegistered_ncitizen() {
        return registered_ncitizen;
    }

    public static ArrayList<Appointment> getApprecords() {
        return apprecords;
    }

    public int getTot_app() {
        return tot_app;
    }

    public static ArrayList<CentreVaccines> getCentrevacrecords() {
        return centrevacrecords;
    }
    
    public Report(){
        int i=0;
        pplrecords = allPeople;
        
        for(i=0; i < pplrecords.size(); i++){
            registered_ppl +=1;
            
            if(pplrecords.get(i).getGender().equals("Male")){
                registered_male +=1;
            }else{
                registered_female +=1;
            }
            
            if(pplrecords.get(i).getNationality().equals("Citizen")){
                registered_citizen +=1;
            }else{
                registered_ncitizen +=1;    
            }           
        }
          
        ArrayList<AppointmentCount> ac = new ArrayList<AppointmentCount>();           
        apprecords = allAppointments;
        for (i = 0; i < allCentreVaccines.size(); i++) {
            AppointmentCount a = new AppointmentCount(allCentreVaccines.get(i).getCentre().toString());                   
            ac.add(a);
        }
        
        for(i=0; i < apprecords.size(); i++){
            tot_app +=1;
            
            boolean isFound =false;             
            
            for(int j =0; j < ac.size(); j++){
                if(ac.get(j).place.equals(apprecords.get(i).getPlace().toString())){        //search for the place
                    isFound = true;                                                         // if found, then the app count total will add one
                    ac.get(j).setTotal(ac.get(j).getTotal()+1);
                    
                    if(apprecords.get(i).getVaccinationStatus().equals("Completed")){
                       ac.get(j).setComplete(ac.get(j).getComplete() + 1);
                    }else{
                       ac.get(j).setIncomplete(ac.get(j).getIncomplete() + 1);
                    }                    
                    break;
                }               
            }
            
            if(!isFound){                                                                   //if not found, then add a new appointment count into ac
                AppointmentCount a = new AppointmentCount(apprecords.get(i).getPlace().toString(), 
                apprecords.get(i).getVaccinationStatus().equals("Completed"));              //AppointmentCount x = new AppointmentCount(place, boolean)
                ac.add(a);
                
            }
        }
              
        appDetails = ""; 
   
            for (i = 0; i < ac.size(); i++) {
                int vacAmount1 = ac.get(i).getVacamount();
                String condition = (vacAmount1 <= 10 ? "Urgent" : vacAmount1 <= 20 ? "Moderate" : "Sufficient");
                
                appDetails += "Centre: " + ac.get(i).getPlace() + "\nTotal: " + ac.get(i).getTotal() + "\nCompleted: "
                        + ac.get(i).getComplete() + "     Incomplete: " + ac.get(i).getIncomplete() + "\nTotal Vaccines Amount: "
                        + ac.get(i).getVacamount() + "\nCondition: " + condition +"\n\n";

            }
        }            
      
    public String getReport(){
          SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ssaa dd/MM/yyyy");           //M month, m minute
          String datestr = sdf.format(new Date());
          
          String info,  tot_ppl, tot_male, tot_female, tot_citizen, tot_ncitizen;         
          tot_ppl = "Total registered people: " + registered_ppl;
          tot_male = "Total registered male: " + registered_male;
          tot_female = "Total registered female: " + registered_female;
          tot_citizen = "Total registered citizen: " + registered_citizen;
          tot_ncitizen = "Total registered non-citizen: " + registered_ncitizen;
                   
          info = "Report generated on " + datestr + "\n\n"+ "**People**\n" + tot_ppl + "\n" + 
          tot_male + "\n" + tot_female + "\n" + tot_citizen + "\n" + tot_ncitizen + "\n\n**Total appointments and vaccines supply of each centre**\n" + appDetails ;       
          return info;
    }
}
