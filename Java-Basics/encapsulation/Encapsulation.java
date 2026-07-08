class Student {
    public int id, nos;
    public String name;
    private int age;
    private String gfName;

    public Student(int id, int nos, int age, String name, String gfName) {
        this.id = id;
        this.age = age;
        this.nos = nos;
        this.name = name;
        this.gfName = gfName;

    }

    private void studentGf(int id) {
        System.out.println("Student whose id is " + id + " his gf name is " + gfName);
    }

    public void study(int id) {
        System.out.println("Student whose id is " + id + " is studying.");
    }

    public String getStudentGfName() {
        return this.gfName;
    }

    public void setStudentGfName(String gfName) {
        this.gfName = gfName;
        System.out.println("Student gf: " + gfName);
    }

}
