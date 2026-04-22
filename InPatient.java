public class InPatient extends Patient{
    //Attributes
    private int roomNumber;
    private String building;
    private int admitDays;

    public InPatient (int patientId, String name, int age, String blood, String gender, String birthDate, String tel, String disease, String type,
        int roomNumber, String building, int admitDays) {
        super(patientId, name, age, blood, gender, birthDate, tel, disease, type);
        this.roomNumber = roomNumber;
        this.building = building;
        this.admitDays = admitDays;
    }

    //getters and setters
    public int getRoomNum() {
        return roomNumber;
    }
    public String getBuilding() {
        return building;
    }
    public int getAdmitDays() {
        return admitDays;
    }
    public void setRoomNum(int room) {
        this.roomNumber = room;
    } 
    public void setBuilding(String building) {
        this.building = building;
    }
    public void setAdmitDays(int admit) {
        this.admitDays = admit;
    }

    @Override
    public double extraCharge() {
        return 12000;
    }
}
