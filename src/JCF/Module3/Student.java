package JCF.Module3;


public class Student implements Comparable<Student>{
    // public int rollNo;
    public int age;
    public String name;
    public double weight;

    Student(int age, String name,double weight){

        this.age=age;
        this.name=name;
        this.weight=weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student{" +

                ", age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Student o){
if(this.age==o.age){
   return this.name.compareTo(o.name);
}
       return Integer.compare(this.age,o.age);

    }



}
