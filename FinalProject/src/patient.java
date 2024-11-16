public class patient extends Person {
    private String medicalHistory;

    public patient(String name, int age, String address, String medicalHistory) {
        super(name, age, address); 
        this.medicalHistory = medicalHistory;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Medical History: " + medicalHistory);
    }

}