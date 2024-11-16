public class doctor extends Person {
    private String specialty;

    public doctor(String name, int age, String address, String specialty) {
        super(name, age, address);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Specialty: " + specialty);
    }

    public void diagnosePatient(patient patient) {
        System.out.println(name + " is diagnosing " + patient.getName() + ".");
    }
}