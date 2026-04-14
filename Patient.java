import java.util.ArrayList;

public class Patient {
    //Attributes
    private String patientId;
    private String name;
    private int age;
    private String blood;
    private String gender;
    private String birthDate;
    private String tel;
    private String disease;
    private String type;

    //one to many
    private ArrayList<PatientBill> bills = new ArrayList<>();

    //Constructor
    public Patient(String patientId, String name, int age, String blood, String gender, String birthDate, String tel, String disease, String type) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.blood = blood;
        this.gender = gender;
        this.birthDate = birthDate;
        this.tel = tel;
    }

    //Getters and Setters
    public String getPatientId () {
        return patientId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getBlood() {
        return blood;
    }
    public String getGender() {
        return gender;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public String getTel() {
        return tel;
    }
    public String getDisease() {
        return disease;
    }
    public String getType() {
        return type;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setBlood(String blood) {
        this.blood = blood;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public void setType(String type) {
        this.type = type;
    }

    //Method add bill for each patient
    public void addBill(PatientBill bill) {
        bills.add(bill);
    }
}
