public class Student {
    private String name;
    private int age;
    private double grade;
     //Constructor
    public Student(String name,int age, double grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println("Name: " + name +
                ", Age: " + age +
                ", Grade: " + grade +
                ", Passed: " + hasPassed());
    }

public  boolean hasPassed() {
        return grade <5;
    }
}