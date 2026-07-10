package JCF.Module2;


import java.util.HashSet;
import java.util.Objects;

class Student{
    public int rollNo;
    public String name;

    Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    @Override
    public String toString(){
        return "Student{Roll No.: "+rollNo+" , Name: "+name+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}

public class CustomDTHashSet {
    static void main() {
        // creating a hashset using custom datatype
        HashSet<Student> set=new HashSet<>();

        //creating objects of Student class
        Student s1=new Student(1,"Rahul Sain");
        Student s2=new Student(1,"Rahul Sain");
        Student s3=new Student(1,"Rahul Sain");

    //     adding them into set
        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);
    }
}
