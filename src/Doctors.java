import java.util.ArrayList;
import java.util.List;

public class Doctors extends Person {
    // Private fields for encapsulation
    private String specialization;
    private String doctorID;
    private List<Patient> patientHistory;


    // Constructor to initialize doctor attributes
    public Doctors(String name, int age, String gender, String specialization, String doctorID) {
        super(name, age, gender); // Call the parent class constructor
        this.specialization = specialization;
        this.doctorID = doctorID;
        this.patientHistory = new ArrayList<>(); // Initialize the history list
    }

    // Getters and setters for encapsulation and validation
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if (!specialization.isEmpty()) {
            this.specialization = specialization;
        } else {
            System.out.println("Specialization cannot be empty.");
        }
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        if (!doctorID.isEmpty()) {
            this.doctorID = doctorID;
        } else {
            System.out.println("Doctor ID cannot be empty.");
        }
    }

    // Add a patient to the history
    public void addPatientToHistory(Patient patient) {
        patientHistory.add(patient);
    }

    // Display patient history
    public void displayPatientHistory() {
        System.out.println("Patient History for Doctor: " + getName());
        if (patientHistory.isEmpty()) {
            System.out.println("No patients treated yet.");
        } else {
            for (Patient patient : patientHistory) {
                patient.displayInfo();
                System.out.println(); // Blank line for separation
            }
        }
    }

    // Overridden method to display doctor information
    @Override
    public void displayInfo() {
        System.out.println("------ Doctor Details ------");
        super.displayInfo(); // Display basic info from the Person class
        System.out.println("Specialization: " + specialization);
        System.out.println("Doctor ID      : " + doctorID);
        System.out.println("----------------------------");
    }
}