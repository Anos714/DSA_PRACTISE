public class App {
    public static void main(String[] args) {
        Student s1 = new Student(201, 6, 17, "Leon", "Ada");

        s1.study(s1.id);
        // we can try printing private varibale it always gives error
        // System.out.println(s1.age);
        // s1.studentGf(s1.id)//it throws error bcx=z it is private method so it is not
        // accessible
    }
}
