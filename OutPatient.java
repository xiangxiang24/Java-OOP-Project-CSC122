public class OutPatient {
    //Attributes
    private String appointmentDate;

    //Constructor
    public OutPatient (String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    //getter and setter
    public String getAppointment() {
        return appointmentDate;
    }
    public void setAppointment(String appoint) {
        this.appointmentDate = appoint;
    } 
}
