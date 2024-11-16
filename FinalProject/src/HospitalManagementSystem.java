public class HospitalManagementSystem {
    public static void main(String[] args) {
        doctor doctor1 = new doctor("Dr. Balubal", 20, "123 Bagongpook Street", "Cardiologist");
        doctor doctor2 = new doctor("Dr. Andor", 19, "578 Balintawak Street", "Neurologist");
        doctor doctor3 = new doctor("Dr. Matanguihan", 19, "911 Mataasnakahoy Avenue", "Pediatrician");

        patient patient1 = new patient("Filemon Mendoza", 20, "1201 Sabang Street", "Hypertension");
        patient patient2 = new patient("Jericho Belino", 19, "23 Lemery Road", "Asthma");
        patient patient3 = new patient("Hannah Dioneda", 20, "321 San Jose Lane", "Diabetes");

        System.out.println("Doctor Information:");
        doctor1.displayInfo();
        System.out.println();
        doctor2.displayInfo();
        System.out.println();
        doctor3.displayInfo();
        System.out.println();

        System.out.println("Patient Information:");
        patient1.displayInfo();
        System.out.println();
        patient2.displayInfo();
        System.out.println();
        patient3.displayInfo();
        System.out.println();

        System.out.println("Diagnoses:");
        doctor1.diagnosePatient(patient1);
        doctor2.diagnosePatient(patient2);  
        doctor3.diagnosePatient(patient3); 
    }
}