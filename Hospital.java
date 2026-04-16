import java.util.Scanner;
public class Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("- - - - - Welcome to TinyHospital - - - - -");
        System.out.println("This system may help you being satisfied on patient's information management");
        System.out.println("-* We hope you will get best experience! *-");
        System.out.println("-- Start Program Press 'begin' Enter --");

        String start = scan.nextLine();
        if (start.equalsIgnoreCase("begin")) {
            System.out.println("--Welcome to Hospital Managemant session--");
            System.out.println("---------------- Main Page ---------------");
            System.out.println("- (A) CHECK ALL PAITENT -");
            System.out.println("- (B) ADD NEW PAITENT DATA -"); //Check bill after then
            System.out.println("- (C) CHECK PAITENT BY ID -"); //Check bill after then
            System.out.println("- (D) CHECK PAITENT DISEASE -");
            System.out.println("- (E) CHECK PAITENT FROM BUILDING -");
            System.out.println("- (F) CHECK PAITENT TYPE -");
            System.out.println("- (G) ADD BILL BY ID -");
            System.out.println("- (H) CHECK BILL BY ID -");

            System.out.println();
            System.out.print("Type : ");
            String menu = scan.nextLine();
            PatientSystem system = new PatientSystem();
            switch (menu) {
                case "A":
                    System.out.printf("%-8s %-20s %-7s %-7s %-7s %-15s %-15s %-15s %-5s %-5s %-7s %-10s %-15s",
                        "ID", "NAME", "AGE", "BLOOD", "GENDER", "BIRTHDATE", "CONTACT", "DISEASE", "TYPE", "ROOM", "BLOCK", "AM-DAYS", "APPOINTMENT"
                    );
                    System.out.println();
                    system.displayAllPatients();
                    break;
                case "B":
                    system.addPatient();
                    break;
                case "C":
                    system.searchById();
                    break;
                case "D":
                    system.displayPatientByDisease();
                    break;
                case "E":
                    system.displayPatientByBuilding();
                    break;
                case "F":
                    system.displayPatientByType();
                    break;
                case "G":
                    System.out.print("Please Type Patient Id: ");
                    system.addBillPatient();
                    break;
                case "H":
                    System.out.print("Please Type Patient Id: ");
                    system.checkBill();
                    break;
                default:
                    break;
            }
        }
        scan.close();
    }
}


