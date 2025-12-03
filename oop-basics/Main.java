public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Mina", 22, 6.5);
        Student s2 = new Student("Ali", 21, 4.8);

        s1.printInfo();
        s2.printInfo();


        s2.setGrade(5.2);
        System.out.println("After grade change:");
        s2.printInfo();
    }
}

