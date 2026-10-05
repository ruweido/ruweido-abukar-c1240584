public class Course {
    private String courseName;
    private String[] students = new String[2];
    private int numberOfStudents = 0;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String[] getStudents() {
        String[] result = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            result[i] = students[i];
        }
        return result;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] larger = new String[students.length * 2];
            for (int i = 0; i < numberOfStudents; i++) {
                larger[i] = students[i];
            }
            students = larger;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                return;
            }
        }
    }

    public String toString() {
        String result = "Course: " + courseName +
                "\n\tNumber of Students: " + numberOfStudents;
        for (int i = 0; i < numberOfStudents; i++) {
            result = result + "\n\t" + (i + 1) + ". " + students[i];
        }
        return result + "\n";
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming");
        System.out.println(c1);

        c1.addStudent("Ali");
        c1.addStudent("ruweido");
        c1.addStudent("abukar");
        c1.addStudent("saciido");
        System.out.println(c1);

        c1.dropStudent("ruweido");
        System.out.println(c1);
        System.out.println("students: " + c1.getNumberOfStudents());
    }
}