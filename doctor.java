class Doctor extends Person {
    private String specialization;
    private String doctorID;

    public Doctor(String name, int age, String gender, String specialization, String doctorID) {
        super(name, age, gender);
        this.specialization = specialization;
        this.doctorID = doctorID;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getDoctorID() {
        return doctorID;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
        System.out.println("Doctor ID: " + doctorID);
    }
}