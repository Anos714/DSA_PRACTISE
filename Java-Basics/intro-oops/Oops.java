
//define a class
class Student {
    // attributes (identifiers,variables)
    int id, age, nos;
    String name;

    // behaviours (methods)
    void study(int id) {
        System.out.println("student with " + id + " study");
    }

    void sleep(int id) {
        System.out.println("student with " + id + " sleep");
    }
}

public class Oops {
    public static void main(String[] args) {
        // creation of object of class Student
        Student s1 = new Student();
        s1.age = 12;
        s1.id = 1;
        s1.nos = 6;
        s1.name = "Rahul Sain";

        s1.study(s1.id);
        s1.sleep(s1.id);
    }
}