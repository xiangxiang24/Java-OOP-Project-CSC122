import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;


public class FileManager {
    File filename = new File("patientData.txt");

    public void writeData(Patient patient) {
        try {

            FileWriter filewrite = new FileWriter("txt/patientData.txt", true);
            BufferedWriter bufwrite = new BufferedWriter(filewrite);

            // get object from Patient class
            String line = "";
            if (patient instanceof InPatient) {
                InPatient ip = (InPatient) patient;
                line = (ip.getPatientId() + "," + ip.getName() + "," +
                ip.getAge() + "," + ip.getBlood() + "," + ip.getGender() + "," +
                ip.getBirthDate() + "," + ip.getTel() + "," + ip.getDisease() + "," + 
                ip.getType() + "," + ip.getRoomNum() + "," + ip.getBuilding() + "," + ip.getAdmitDays() + "," + "-");
            } else if (patient instanceof OutPatient) {
                OutPatient op = (OutPatient) patient;
                line = (op.getPatientId() + "," + op.getName() + "," +
                op.getAge() + "," + op.getBlood() + "," + op.getGender() + "," +
                op.getBirthDate() + "," + op.getTel() + "," + op.getDisease() + "," + 
                op.getType() + "," + "0,-,0,"+ op.getAppointment()); 
            }

            bufwrite.newLine();
            bufwrite.write(line);
            bufwrite.close();
        } catch (Exception er) {
            er.printStackTrace();
        }
    }

    public void readDataAll() {
        try {

            FileReader fileread = new FileReader("txt/patientData.txt");
            BufferedReader bufread = new BufferedReader(fileread);

            String line = bufread.readLine();

            //Read all of data in file
            while (line != null) {
                String[] part = line.split(",");
                int id = Integer.parseInt(part[0]);
                String name = part[1];
                int age = Integer.parseInt(part[2]);
                String blood = part[3];
                String gender = part[4];
                String birthDate = part[5];
                String tel = part[6];
                String disease = part[7];
                String type = part[8];
                int room = Integer.parseInt(part[9]);
                String building = part[10];
                int admit = Integer.parseInt(part[11]);
                String appdate = part[12];

                System.out.printf("%-8d %-20s %-7d %-7s %-7s %-15s %-15s %-15s %-5s %-5d %-7s %-10d %-15s\n", 
                id, name, age, blood, gender, birthDate, tel, disease, type, room, building, admit, appdate);

                line = bufread.readLine();
            }
            bufread.close();

        } catch (Exception er) {
            er.printStackTrace();
        }
    }

    public void readFromBuilding(String targetBuilding) {
        try {

            FileReader fileread = new FileReader("txt/patientData.txt");
            BufferedReader bufread = new BufferedReader(fileread);

            String line = bufread.readLine();

            int countB = 0;

            while (line != null) {
                String[] part = line.split(",");
                int id = Integer.parseInt(part[0]);
                String name = part[1];
                int age = Integer.parseInt(part[2]);
                String blood = part[3];
                String gender = part[4];
                String birthDate = part[5];
                String tel = part[6];
                String disease = part[7];
                String type = part[8];
                int room = Integer.parseInt(part[9]);
                String building = part[10];
                int admit = Integer.parseInt(part[11]);
                String appdate = part[12];

                if (building.equalsIgnoreCase(targetBuilding)) {
                    System.out.printf("%-8d %-20s %-7d %-7s %-7s %-15s %-15s %-15s %-5s %-5d %-7s %-10d %-15s\n", 
                id, name, age, blood, gender, birthDate, tel, disease, type, room, building, admit, appdate);

                    countB++;
                }
                line = bufread.readLine();
            }
            if (countB == 0) {
                System.out.println("-Sorry, There is no Patient in this Building-");
            }
            bufread.close();

        } catch (Exception er) {
            er.printStackTrace();
        }
    }

    public void readDataFromDisease(String di) {
        try {
            FileReader fileread = new FileReader("txt/patientData.txt");
            BufferedReader bufread = new BufferedReader(fileread);

            String line = bufread.readLine();

            int countD = 0;

            while (line != null) {
                String[] part = line.split(",");
                int id = Integer.parseInt(part[0]);
                String name = part[1];
                int age = Integer.parseInt(part[2]);
                String blood = part[3];
                String gender = part[4];
                String birthDate = part[5];
                String tel = part[6];
                String disease = part[7];
                String type = part[8];
                int room = Integer.parseInt(part[9]);
                String building = part[10];
                int admit = Integer.parseInt(part[11]);
                String appdate = part[12];

                if (disease.equalsIgnoreCase(di)) {
                    System.out.printf("%-8d %-20s %-7d %-7s %-7s %-15s %-15s %-15s %-5s %-5d %-7s %-10d %-15s\n", 
                id, name, age, blood, gender, birthDate, tel, disease, type, room, building, admit, appdate);
                    countD++;
                }
                line = bufread.readLine();
            }
            if (countD == 0) {
                System.out.println("No patients with this disease have been found yet.");
            }
            bufread.close();

        } catch (Exception er) {
            er.printStackTrace();
        }
    }

    public void readDataFromType(String T) {
        try {
            FileReader fileread = new FileReader("txt/patientData.txt");
            BufferedReader bufread = new BufferedReader(fileread);

            String line = bufread.readLine();

            int countT = 0;
            while (line != null) {
                String[] part = line.split(",");
                int id = Integer.parseInt(part[0]);
                String name = part[1];
                int age = Integer.parseInt(part[2]);
                String blood = part[3];
                String gender = part[4];
                String birthDate = part[5];
                String tel = part[6];
                String disease = part[7];
                String type = part[8];
                int room = Integer.parseInt(part[9]);
                String building = part[10];
                int admit = Integer.parseInt(part[11]);
                String appdate = part[12];

                if (type.equalsIgnoreCase(T)) {
                    System.out.printf("%-8d %-20s %-7d %-7s %-7s %-15s %-15s %-15s %-5s %-5d %-7s %-10d %-15s\n", 
                id, name, age, blood, gender, birthDate, tel, disease, type, room, building, admit, appdate);
                    countT++;
                }
                line = bufread.readLine();
            }
            if (countT == 0) {
                System.out.println("Please, make sure you search the type of patient correctly");
            }
            bufread.close();

        } catch (Exception er) {
            er.printStackTrace();
        }
    }

    public Patient searchId (int seachId) {
        try {
            FileReader fileread = new FileReader("txt/patientData.txt");
            BufferedReader bufread = new BufferedReader(fileread);

            String line = bufread.readLine();
            int countId = 0;
            while (line != null) {
                String[] part = line.split(",");
                int id = Integer.parseInt(part[0]);
                String name = part[1];
                int age = Integer.parseInt(part[2]);
                String blood = part[3];
                String gender = part[4];
                String birthDate = part[5];
                String tel = part[6];
                String disease = part[7];
                String type = part[8];
                int room = Integer.parseInt(part[9]);
                String building = part[10];
                int admit = Integer.parseInt(part[11]);
                String appdate = part[12];

                if (id == (seachId)) {
                    System.out.printf("%-8d %-20s %-7d %-7s %-7s %-15s %-15s %-15s %-5s %-5d %-7s %-10d %-15s\n", 
                    id, name, age, blood, gender, birthDate, tel, disease, type, room, building, admit, appdate);
                    countId++;
                }
                line = bufread.readLine();
            }
            if (countId == 0) {
                System.out.println("No patient with this ID have create yet");
            }
            bufread.close();
        } catch (Exception er ){
            er.printStackTrace();
        }
        return null;
    }

    public Patient getObjectPatient (int getid) {
        try {
            FileReader fileread = new FileReader("txt/patientData.txt");
            BufferedReader bufread = new BufferedReader(fileread);

            String line = bufread.readLine();

            while (line != null) {
                String[] part = line.split(",");
                int id = Integer.parseInt(part[0]);
                String name = part[1];
                int age = Integer.parseInt(part[2]);
                String blood = part[3];
                String gender = part[4];
                String birthDate = part[5];
                String tel = part[6];
                String disease = part[7];
                String type = part[8];
                int room = Integer.parseInt(part[9]);
                String building = part[10];
                int admit = Integer.parseInt(part[11]);
                String appdate = part[12];

                if (id == (getid)) {
                    if (type.equalsIgnoreCase("In")) {
                        return new InPatient(id, name, age, blood, gender, birthDate, tel, disease, type, room, building, admit);
                    } else {
                        return new OutPatient(id, name, age, blood, gender, birthDate, tel, disease, type, appdate);
                    }
                }
                line = bufread.readLine();
            }
            bufread.close();
        } catch (Exception er ){
            er.printStackTrace();
        }
        return null;
    }

    public void checkBills(int patientId) {
        try {
            FileReader billread = new FileReader("txt/billData.txt");
            BufferedReader bwread = new BufferedReader(billread);
            String line = bwread.readLine();
            double total = 0;
            int countbill = 0;
            while (line != null) {
                String[] part = line.split(",");
                int ptid = Integer.parseInt(part[0]);
                String des = part[1];
                double price = Double.parseDouble(part[2]);

                if (ptid == patientId) {
                    total += price;
                    System.out.printf("%-8d %-15s %-10.2f\n", ptid, des,price);
                    countbill++;
                }
                line = bwread.readLine();
            }

            if (countbill == 0) {
                System.out.println("This patient hasn't have any medicine expense. Only Extra Charge");
            }
            bwread.close();

            //Extra charge
            Patient p = getObjectPatient(patientId);
            double extra = p.extraCharge();
            
            double finalExpense = total + extra;
            System.out.println("Basic Expenses: " + total);
            System.out.println("Extra Charge: +" + extra);
            System.out.println("Total Expenses: " + finalExpense);
        } catch (Exception er) {
            er.printStackTrace();
        }
    }

    public void addBillPatient(int patientId, PatientBill bill) {
        try {
            FileWriter billwrite = new FileWriter("txt/billData.txt", true);
            BufferedWriter bufbill = new BufferedWriter(billwrite);

            String line = "";
            line = patientId + "," + bill.getDescription() + "," + bill.getPrice();
            bufbill.write(line);
            bufbill.newLine();
            bufbill.close();
        } catch (Exception er) {
            er.printStackTrace();
        }
    }
    
}
