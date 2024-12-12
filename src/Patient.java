public class Patient extends Person {
    // Private fields for encapsulation
    private String patientID;
    private String ailment;

    // Constructor to initialize patient attributes
    public Patient(String name, int age, String gender, String patientID, String ailment) {
        super(name, age, gender); // Call parent class constructor
        this.patientID = patientID;
        this.ailment = ailment;
    }

    // Getters and setters for encapsulation
    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        if (!patientID.isEmpty()) {
            this.patientID = patientID;
        } else {
            System.out.println("Patient ID cannot be empty.");
        }
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        if (!ailment.isEmpty()) {
            this.ailment = ailment;
        } else {
            System.out.println("Ailment cannot be empty.");
        }
    }

    // Overridden method to display patient information
    @Override
    public void displayInfo() {
        System.out.println("------ Patient Details ------");
        super.displayInfo(); // Display basic info from Person class
        System.out.println("Patient ID : " + patientID);
        System.out.println("Ailment    : " + ailment);
        System.out.println("-----------------------------");
    }
}