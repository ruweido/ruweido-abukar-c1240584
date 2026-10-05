    public class Employee {
        // fields
        private int id;
        private String firstName;
        private String lastName;
        private int salary;

        // si aan u fahamno isticmaalka "this" keyword
        public Employee(int id,
                        String firstName,
                        String lastName,
                        int salary
        ) {
            this.salary = salary; // (2500)
            this.id = id; // 8
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // getters
        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getName() {
            return firstName + " " + lastName;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getAnnualSalary() {
            return salary * 12;
        }

        public int raiseSalary(int percent) {
            int increasedAmount = salary * percent / 100;
            salary = salary + increasedAmount;
            return salary;
        }

        public String toString() {
            return "Employee: " +
                    "\n\tID: " + id +
                    "\n\tName: " + getName() +
                    "\n\tSalary: " + salary
                    + "\n";


        }
    }

    class Test {
        public static void main(String[] args) {
            // Test constructor and toString()
            Employee e1 = new Employee(8, "Abukar", "cabdinuur", 500);
            System.out.println(e1);  // toString();

            // test setters and getters
            e1.setSalary(500);
            System.out.println(e1);  // toString();
            System.out.println("id is: " + e1.getId());
            System.out.println("firstname is: " + e1.getFirstName());
            System.out.println("lastname is: " + e1.getLastName());
            System.out.println("salary is: " + e1.getSalary());

            System.out.println("name is: " + e1.getName());
            System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

            // Test raiseSalary()
            System.out.println(e1.raiseSalary(10));
            System.out.println(e1);
        }
    }


