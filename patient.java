class Patient extends Person {
    private String patientID;
    private String ailment;

    public Patient(String name, int age, String gender, String patientID, String ailment) {
        super(name, age, gender);
        this.patientID = patientID;
        this.ailment = ailment;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getAilment() {
        return ailment;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Patient ID: " + patientID);
        System.out.println("Ailment: " + ailment);
    }
}