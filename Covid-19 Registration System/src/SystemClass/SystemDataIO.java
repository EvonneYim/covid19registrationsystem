package SystemClass;

import System.CommitteeVaccines;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SystemDataIO {

    public static ArrayList<Appointment> allAppointments
            = new ArrayList<Appointment>();
    public static ArrayList<Vaccines> allVaccines
            = new ArrayList<Vaccines>();
    public static ArrayList<CentreVaccines> allCentreVaccines
            = new ArrayList<CentreVaccines>();
    public static ArrayList<People> allPeople
            = new ArrayList<People>();
    public static ArrayList<Committee> allCommitee
            = new ArrayList<Committee>();
    public static CommitteeVaccines cvFrame = new CommitteeVaccines();
                    
    public static void read() {
        try {
            allAppointments.clear();
            allVaccines.clear();
            allPeople.clear();
            allCommitee.clear();
            allCentreVaccines.clear();
            
            Scanner s1 = new Scanner(new File("Commitee.txt"));
            while (s1.hasNext()) {
                String line = s1.nextLine();
                String[] wordsinLine;
                String cno = null;
                String username = null;
                String password = null;
                if (!(line.isEmpty())) {

                    wordsinLine = line.split(";");
                    cno = wordsinLine[0];
                    username = wordsinLine[1];
                    password = wordsinLine[2];
                }

                Committee c = new Committee(cno, username, password);
                allCommitee.add(c);
            }

            Scanner s2 = new Scanner(new File("People.txt"));
            while (s2.hasNext()) {
                String line = s2.nextLine();
                String[] wordsinLine;
                String peopleID = null;
                String peopleName = null;
                String address = null;
                int age = 0;           //here got prob
                String gender = null;
                String mobileNo = null;
                String password = null;
                String nationality = null;
                
                if (!(line.isEmpty())) {

                    wordsinLine = line.split(";");
                    peopleID = wordsinLine[0];
                    peopleName = wordsinLine[1];
                    address = wordsinLine[2];
                    age = Integer.parseInt(wordsinLine[3]);
                    gender = wordsinLine[4];
                    mobileNo = wordsinLine[5];
                    password = wordsinLine[6];
                    nationality = wordsinLine[7];
                }

                People p = new People(peopleID, peopleName, address, age, gender, mobileNo, password, nationality);
                allPeople.add(p);
            }

            Scanner s3 = new Scanner(new File("Appointment.txt"));
            while (s3.hasNext()) {
                String line = s3.nextLine();
               
                                            
//                String pplID = null;
//                String pplname = null;
//                ppl.setPeopleID(null);
//                ppl.setPeopleName(null);
                
//                int appID = 0;
//                String appDate = null;
//                String appTime = null;
//                int dose = 0;
//                String appStatus = null;
//                String vacStatus = null;
//                Centre centre = null;
                              
                if (!(line.isEmpty())) {
                    String[] wordsinLine = line.split(";");
                    String x = wordsinLine[0];
                    
                    People ppl = checkingPeople(x);
                     
//                    String y = ppl.getPeopleName();
                 
                    String y = wordsinLine[1];
                    String appID = wordsinLine[2];
                    String appDate = wordsinLine[3];
                    String appTime = wordsinLine[4];
                    int dose = Integer.parseInt(wordsinLine[5]);
                    Centre centre = Centre.valueOf(wordsinLine[6]);
                    String appStatus = wordsinLine[7];
                    String vacStatus = wordsinLine[8];
                          
                    Appointment a = new Appointment(ppl,appDate, appTime, dose, centre, appStatus, vacStatus, appID);
                    allAppointments.add(a);
                    ppl.getMyAppointment().add(a);
                }

               
//                ppl.getMyAppointment().add(a);
            }

            Scanner s4 = new Scanner(new File("Vaccines.txt"));
            while (s4.hasNext()) {
                String line = s4.nextLine();
                String[] wordsinLine;

                if (!(line.isEmpty())) {

                    wordsinLine = line.split(";");
                    String SupplyId = wordsinLine[0];
                    Centre place = Centre.valueOf(wordsinLine[1]);
                    int supplyamount = Integer.parseInt(wordsinLine[2]);
                    Vaccines v = new Vaccines(place, supplyamount,SupplyId);
                    allVaccines.add(v);
                }
            }
            
            Scanner s5 = new Scanner(new File("CentreVaccines.txt"));
            while (s5.hasNext()) {
                String line = s5.nextLine();
                String[] wordsinLine;
                
                if (!(line.isEmpty())) {
                    wordsinLine = line.split(";");
                    Centre centre = Centre.valueOf(wordsinLine[0]);
                    int vacAmount = Integer.parseInt(wordsinLine[1]);
                    CentreVaccines cv = new CentreVaccines(centre, vacAmount);
                    allCentreVaccines.add(cv);
                }
            }

        } catch (Exception e) {
            System.out.println("Error in read!");
            e.printStackTrace();
        }
    }

    public static void write() {
        try {
            PrintWriter p1 = new PrintWriter("Commitee.txt");
            for (int i = 0; i < allCommitee.size(); i++) {
                p1.print(allCommitee.get(i).getCno() + ";");
                p1.print(allCommitee.get(i).getUsername() + ";");
                p1.print(allCommitee.get(i).getPassword() + ";");
                p1.println();
            }
            p1.close();

            PrintWriter p2 = new PrintWriter(new FileOutputStream("People.txt", false));
            for (int i = 0; i < allPeople.size(); i++) {
                p2.print(allPeople.get(i).getPeopleID() + ";");
                p2.print(allPeople.get(i).getPeopleName() + ";");
                p2.print(allPeople.get(i).getAddress() + ";");
                p2.print(allPeople.get(i).getAge() + ";");
                p2.print(allPeople.get(i).getGender() + ";");
                p2.print(allPeople.get(i).getMobileNo() + ";");
                p2.print(allPeople.get(i).getPassword() + ";");
                p2.print(allPeople.get(i).getNationality() + ";");
                p2.println();
            }
            p2.close();

            PrintWriter p3 = new PrintWriter("Appointment.txt");
            for (int i = 0; i < allAppointments.size(); i++) {
                p3.print(allAppointments.get(i).getPpl().getPeopleID() + ";");
                p3.print(allAppointments.get(i).getPpl().getPeopleName() + ";");
                p3.print(allAppointments.get(i).getAppointmentID() + ";");
                p3.print(allAppointments.get(i).getAppointmentDate() + ";");
                p3.print(allAppointments.get(i).getAppointmentTime() + ";");
                p3.print(allAppointments.get(i).getDose() + ";");
                p3.print(allAppointments.get(i).getPlace() + ";");
                p3.print(allAppointments.get(i).getAppointmentStatus() + ";");
                p3.print(allAppointments.get(i).getVaccinationStatus() + ";");
                p3.println();
            }
            p3.close();

            PrintWriter p4 = new PrintWriter("Vaccines.txt");
            for (int i = 0; i < allVaccines.size(); i++) {
                p4.print(allVaccines.get(i).getSupplyID() + ";");
                p4.print(allVaccines.get(i).getPlace() + ";");
                p4.print(allVaccines.get(i).getSupplyamount() + ";");
                p4.println();
            }
            p4.close();

            PrintWriter p5 = new PrintWriter("CentreVaccines.txt");
            
            for (int i = 0; i < allCentreVaccines.size(); i++) {
                String l = allCentreVaccines.get(i).getCentre().toString();
                String va = allCentreVaccines.get(i).getVacamount() + "";
                p5.print(l + ";");
                p5.print(va + ";");
                p5.println();
            }
            p5.close();
            
        } catch (Exception e) {
            System.out.println("Error in write!");
        }
    }

    public static Committee checkingCommitee(String x) {
        for (int i = 0; i < allCommitee.size(); i++) {
            if (x.equals(allCommitee.get(i).getUsername())) {
                return allCommitee.get(i);
            }
        }
        return null;
    }

    public static People checkingPeople(String x) {
        
        for (int i = 0; i < allPeople.size(); i++) {
            if (x.equals(allPeople.get(i).getPeopleID())) {
                return allPeople.get(i);
            }
        }
        return null;
    }

}
