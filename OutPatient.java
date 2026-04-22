public class OutPatient extends Patient {
    //Attributes
    private String appointmentDate;

    //Constructor
    public OutPatient (int patientId, String name, int age, String blood, String gender, String birthDate, 
        String tel, String disease, String type, String appointmentDate) {
        super(patientId, name, age, blood, gender, birthDate, tel, disease, type);
        this.appointmentDate = appointmentDate;
    }

    //getter and setter
    public String getAppointment() {
        return appointmentDate;
    }
    public void setAppointment(String appoint) {
        this.appointmentDate = appoint;
    } 

    public double extraCharge() {
        return 1500;
    }
}
