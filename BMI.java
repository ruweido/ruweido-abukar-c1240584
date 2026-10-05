public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBMI() {
        return weight * 703 / (height * height);
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public String toString() {
        return "BMI: " +
                "\n\tName: " + name +
                "\n\tAge: " + age +
                "\n\tWeight: " + weight +
                "\n\tHeight: " + height +
                "\n";
    }

    public static void main(String[] args) {
        BMI b1 = new BMI("Ahmed", 25, 160, 70);
        System.out.println(b1);
        System.out.println("BMI is: " + b1.getBMI());
        System.out.println("status is: " + b1.getStatus());

        BMI b2 = new BMI("ruweido", 120, 65);
        System.out.println(b2);
        System.out.println("BMI is: " + b2.getBMI());
        System.out.println("status is: " + b2.getStatus());
    }
}