public abstract class Person {
    // Private fields for encapsulation
    private String name;
    private int age;
    private String gender;

    // Constructor for initializing attributes
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters and setters to provide controlled access to private fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) { // Basic validation for age
            this.age = age;
        } else {
            System.out.println("Age must be non-negative.");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Other")) {
            this.gender = gender;
        } else {
            System.out.println("Invalid gender specified.");
        }
    }

    // Method to display the person's information
    public void displayInfo() {
        System.out.println("------ Person Details ------");
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("Gender    : " + gender);
        System.out.println("----------------------------");
    }
}