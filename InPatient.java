public class InPatient {
    //Attributes
    private int roomNumber;
    private String building;
    private int admitDays;

    public InPatient (int roomNumber, String building, int admitDays) {
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
}
