public class PatientBill {
    //Attributes
    private String description;
    private double price;

    //Constructor
    public PatientBill(String description, double price) {
        this.description = description;
        this.price = price;
    }

    //getters and setters
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public void setDescription(String des) {
        this.description = des;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
