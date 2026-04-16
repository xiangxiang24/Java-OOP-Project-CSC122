import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;


public class FileManager {
    File filename = new File("patientData.txt");

    public void writeData(Patient patient) {
        try {

            FileWriter filewrite = new FileWriter("patientData.txt", true);
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

            FileReader fileread = new FileReader("patientData.txt");
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

            FileReader fileread = new FileReader("patientData.txt");
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

                if (building.equalsIgnoreCase(targetBuilding)) {
                    System.out.printf("%-8d %-20s %-7d %-7s %-7s %-15s %-15s %-15s %-5s %-5d %-7s %-10d %-15s\n", 
                id, name, age, blood, gender, birthDate, tel, disease, type, room, building, admit, appdate);
                }
                line = bufread.readLine();
            }
            bufread.close();

        } catch (Exception er) {
            er.printStackTrace();
        }
    }

    public void readDataFromDisease(String di) {
        try {
            FileReader fileread = new FileReader("patientData.txt");
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

                // 10230,Ammy parson,24,B,F,2000-12-26,0483924539,Diabetes,In,381,H,5,-

                if (disease.equalsIgnoreCase(di)) {
                    System.out.printf("%-8d %-20s %-7d %-7s %-7s %-15s %-15s %-15s %-5s %-5d %-7s %-10d %-15s\n", 
                id, name, age, blood, gender, birthDate, tel, disease, type, room, building, admit, appdate);
                }
                line = bufread.readLine();
            }
            bufread.close();

        } catch (Exception er) {
            er.printStackTrace();
        }
    }

    public void readDataFromType(String T) {
        try {
            FileReader fileread = new FileReader("patientData.txt");
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

                if (type.equalsIgnoreCase(T)) {
                    System.out.printf("%-8d %-20s %-7d %-7s %-7s %-15s %-15s %-15s %-5s %-5d %-7s %-10d %-15s\n", 
                id, name, age, blood, gender, birthDate, tel, disease, type, room, building, admit, appdate);
                }
                line = bufread.readLine();
            }
            bufread.close();

        } catch (Exception er) {
            er.printStackTrace();
        }
    }

    public void searchId (int seachId) {
        try {
            FileReader fileread = new FileReader("patientData.txt");
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
                String building = part[11];
                int admit = Integer.parseInt(part[10]);
                String appdate = part[12];

                if (id == (seachId)) {
                   System.out.printf("%-8d %-20s %-7d %-7s %-7s %-15s %-15s %-15s %-5s %-5d %-7s %-10d %-15s\n", 
                id, name, age, blood, gender, birthDate, tel, disease, type, room, building, admit, appdate);
                }
            }
            bufread.close();
        } catch (Exception er ){
            er.printStackTrace();
        }
    }
}
