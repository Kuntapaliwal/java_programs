package java_programs;

class Student {
    String name;
    int age;
    String address;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not Available";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setInfo(String name, int age, String address) {

        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [address=" + address + ", age=" + age + ", name=" + name + "]";
    }

}

public class StaticPolymorphism {
    public static void main(String[] args) {
        Student[] studentList = new Student[] { new Student(), new Student("john", 20),
                new Student("jack", 89, "main road"), new Student(), new Student("rahul", 18),
                new Student("kp", 21, "manyata"), new Student(), new Student() };
        studentList[0].setInfo("harry", 80);
        studentList[3].setInfo("jarry", 80);
        studentList[6].setInfo("harry", 80);
        studentList[7].setInfo("harry", 80, "manyata");

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
