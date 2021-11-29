package SystemClass;

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
    public static ArrayList<People> allPeople
            = new ArrayList<People>();
    public static ArrayList<Commitee> allCommitee
            = new ArrayList<Commitee>();

    public static void read() {
        try {
            allAppointments.clear();
            allVaccines.clear();
            allPeople.clear();
            allCommitee.clear();
            
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

                Commitee c = new Commitee(cno, username, password);
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
                String[] wordsinLine;

                People ppl = checkingPeople(null);
                int appID = Integer.parseInt(null);
                int appDate = Integer.parseInt(null);
                int appTime = Integer.parseInt(null);
                int dose = Integer.parseInt(null);
                String appStatus = null;
                String vacStatus = null;
                Centre centre = Centre.valueOf(null);

                String x = ppl.getPeopleID();
                String y = ppl.getPeopleName();

                if (!(line.isEmpty())) {

                    wordsinLine = line.split(";");
                    x = wordsinLine[0];
                    y = wordsinLine[1];
                    appID = Integer.parseInt(wordsinLine[2]);
                    appDate = Integer.parseInt(wordsinLine[3]);
                    appTime = Integer.parseInt(wordsinLine[4]);
                    dose = Integer.parseInt(wordsinLine[5]);
                    appStatus = wordsinLine[6];
                    vacStatus = wordsinLine[7];
                    centre = Centre.valueOf(wordsinLine[8]);
                }

                Appointment a = new Appointment(x, y, appID, appDate, appTime, dose, centre, appStatus, vacStatus);
                allAppointments.add(a);
                ppl.getMyAppointment().add(a);
            }

            Scanner s4 = new Scanner(new File("Vaccines.txt"));
            while (s4.hasNext()) {
                String line = s3.nextLine();
                String[] wordsinLine;

                int SupplyId = Integer.parseInt(null);
                Centre centre = Centre.valueOf(null);
                int vacamount = Integer.parseInt(null);
                int supplyamount = Integer.parseInt(null);
                String condition = null;

                if (!(line.isEmpty())) {

                    wordsinLine = line.split(";");
                    SupplyId = Integer.parseInt(wordsinLine[0]);
                    centre = Centre.valueOf(wordsinLine[1]);
                    vacamount = Integer.parseInt(wordsinLine[2]);
                    supplyamount = Integer.parseInt(wordsinLine[3]);
                    condition = wordsinLine[4];
                }

                Vaccines v = new Vaccines(SupplyId, centre, vacamount, supplyamount, condition);
                allVaccines.add(v);
            }

        } catch (Exception e) {
            System.out.println("Error in read!");
            e.printStackTrace();
        }
    }
    
//    public static void readPeople(){
//     try {
//        Scanner s2 = new Scanner(new File("People.txt"));
//            while (s2.hasNext()) {
//                String line = s2.nextLine();
//                String[] wordsinLine;
//                String peopleID = null;
//                String peopleName = null;
//                String address = null;
//                int age = Integer.parseInt(null);
//                String gender = null;
//                String mobileNo = null;
//                String password = null;
//                String nationality = null;
//                
//                if (!(line.isEmpty())) {
//
//                    wordsinLine = line.split(";");
//                    peopleID = wordsinLine[0];
//                    peopleName = wordsinLine[1];
//                    address = wordsinLine[2];
//                    age = Integer.parseInt(wordsinLine[3]);
//                    gender = wordsinLine[4];
//                    mobileNo = wordsinLine[5];
//                    password = wordsinLine[6];
//                    nationality = wordsinLine[7];
//                }
//
//                People p = new People(peopleID, peopleName, address, age, gender, mobileNo, password, nationality);
//                allPeople.add(p);
//            }
//    }catch(Exception e){
//        System.out.println("Error in reading people!");
//    }
//}

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
                p3.print(allAppointments.get(i).getPeopleID() + ";");
                p3.print(allAppointments.get(i).getPeopleName() + ";");
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
                p4.print(allVaccines.get(i).getVacAmount() + ";");
                p4.print(allVaccines.get(i).getSupplyamount() + ";");
                p4.print(allVaccines.get(i).getCondition() + ";");
                p4.println();
            }
            p4.close();

        } catch (Exception e) {
            System.out.println("Error in write!");
        }
    }

    public static Commitee checkingCommitee(String x) {
//        System.out.println(allCommitee.size());
        //read();
        System.out.println(allCommitee.size());
        for (int i = 0; i < allCommitee.size(); i++) {
            if (x.equals(allCommitee.get(i).getUsername())) {
                return allCommitee.get(i);
            }
        }
        return null;
    }

    public static People checkingPeople(String x) {
        
        //read();
        System.out.println(allPeople.size());
        for (int i = 0; i < allPeople.size(); i++) {
            if (x.equals(allPeople.get(i).getPeopleID())) {
                return allPeople.get(i);
            }
        }
        return null;
    }

}
