    public class Person {
        protected String name;
        protected int age;
        protected String address;
    
        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
    
        public String getAddress() {
            return address;
        }
    
        void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Address: " + address);
        }
    }