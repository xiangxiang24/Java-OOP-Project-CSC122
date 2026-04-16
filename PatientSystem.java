import java.util.ArrayList;
import java.util.Scanner;

//Patient class is used as a data model to store patient information, 
// while PatientSystem handles user input and FileManager handles file operations.

public class PatientSystem {
    ArrayList<PatientBill> ptbills = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    //Call method from FileManager
    FileManager fileManager = new FileManager();

    public void addPatient() {
        //Choose type to add first
        System.out.println("What type of patient? (Inpatient / Outpatient)");
        String T = input.nextLine();
        switch (T) {
            case "Inpatient":
                System.out.println("----------------** ADD Inpatient DATA **----------------");
                System.out.println("Enter Patient Id: ");
                int Iid = input.nextInt();
                input.nextLine();

                System.out.println("Enter Patient Name: ");
                String Iname = input.nextLine();

                System.out.println("Enter Patient Age: ");
                int Iage = input.nextInt();
                input.nextLine();

                System.out.println("Enter Patient Blood Type(A/B/O/AB): ");
                String Iblood = input.nextLine();

                System.out.println("Enter Patient Gender(F/M): ");
                String Igender = input.nextLine();

                System.out.println("Enter BirthDate(yyyy-MM-DD): ");
                String IbirthDate = input.nextLine();

                System.out.println("Enter Patient Telephone: ");
                String Itel = input.nextLine();

                System.out.println("Enter Patient Disease: ");
                String Idisease = input.nextLine();

                System.out.println("Enter Patient Type(In/Out): ");
                String Itype = input.nextLine();

                System.out.println("Enter Patient Room Number: ");
                int Iroom = input.nextInt();
                input.nextLine();

                System.out.println("Enter building: ");
                String Ibuilding = input.nextLine();

                System.out.println("Enter Admit Days: ");
                int Idays = input.nextInt();

                System.out.println("----------------** Thank you **----------------");
                input.close();

                InPatient ip = new InPatient(Iid, Iname, Iage, Iblood, Igender, IbirthDate, Itel, Idisease, Itype, Iroom, Ibuilding, Idays);
                fileManager.writeData(ip);
                break;
        
            case "Outpatient":
                System.out.println("----------------** ADD Outpatient DATA **----------------");
                System.out.println("Enter Patient Id: ");
                int Oid = input.nextInt();
                input.nextLine();

                System.out.println("Enter Patient Name: ");
                String Oname = input.nextLine();

                System.out.println("Enter Patient Age: ");
                int Oage = input.nextInt();
                input.nextLine();

                System.out.println("Enter Patient Blood Type(A/B/O/AB): ");
                String Oblood = input.nextLine();

                System.out.println("Enter Patient Gender(F/M): ");
                String Ogender = input.nextLine();

                System.out.println("Enter BirthDate(yyyy-MM-DD): ");
                String ObirthDate = input.nextLine();

                System.out.println("Enter Patient Telephone: ");
                String Otel = input.nextLine();

                System.out.println("Enter Patient Disease: ");
                String Odisease = input.nextLine();

                System.out.println("Enter Patient Type(In/Out): ");
                String Otype = input.nextLine();

                System.out.println("Enter Appointment Date(yyyy-MM-DD): ");
                String Oappdate = input.nextLine();

                System.out.println("----------------** Thank you **----------------");
                input.close();

                OutPatient op = new OutPatient(Oid, Oname, Oage, Oblood, Ogender, ObirthDate, Otel, Odisease, Otype, Oappdate);
                fileManager.writeData(op);
                break;
            default:
                System.out.println("Please identify type correctly");
                return;
        }
    }
    public void displayAllPatients() {
        fileManager.readDataAll();
    }
    public void displayPatientByBuilding() {
        System.out.print("Enter the target Building(AB/FB): ");
        String build = input.nextLine();
        fileManager.readFromBuilding(build);
    }
    public void displayPatientByDisease() {
        System.out.print("Enter Patient Disease: ");
        String dis = input.nextLine();
        fileManager.readDataFromDisease(dis);
    }
    public void displayPatientByType() {
        System.out.print("Enter Type of Patient: ");
        String Type = input.nextLine();
        fileManager.readDataFromType(Type);
    }
    public void searchById() {
        System.out.print("Enter Patient ID (5-digits): ");
        int ptId = input.nextInt();
        fileManager.searchId(ptId);
    }
    public void checkBill() {
        System.out.println("Enter Patient ID to Check bill");
        int ptidbillcheck = input.nextInt();
        System.out.println("*--------* Bill " + ptidbillcheck + " *--------*");
        fileManager.searchId(ptidbillcheck);
        fileManager.checkBills(ptidbillcheck);
    }
    public void addBillPatient() {
        System.out.println("Enter Patient ID to add bill");
        int ptidbill = input.nextInt();
        input.nextLine();
        System.out.println("Enter Details: ");
        String desc = input.nextLine();
        System.out.println("Enter Price: ");
        double price = input.nextDouble();

        PatientBill bb = new PatientBill(desc, price);
        fileManager.addBillPatient(ptidbill, bb);
    }
}
