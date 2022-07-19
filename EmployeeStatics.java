package java_programs;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class EmployeeData1 {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public EmployeeData1(int id, String name, int age, String gender, String department, int yearOfJoining,
            double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id : " + id
                + ", Name : " + name
                + ", age : " + age
                + ", Gender : " + gender
                + ", Department : " + department
                + ", Year Of Joining : " + yearOfJoining
                + ", Salary : " + salary;
    }
}

public class EmployeeStatics {

    public static void main(String[] args) {

        EmployeeData1 emp1 = new EmployeeData1(3, "Vishal Singhal", 34, "male", "HR", 2013, 300000);
        EmployeeData1 emp2 = new EmployeeData1(4, "Amitabh Singh", 35, "male", "Admin", 2014, 500000);
        EmployeeData1 emp3 = new EmployeeData1(5, "Vivek Bhati", 28, "male", "Admin", 2017, 500000);
        EmployeeData1 emp4 = new EmployeeData1(6, "Vipul Diwan", 34, "male", "Account", 2014, 200000);
        EmployeeData1 emp5 = new EmployeeData1(7, "Satish Kumar", 29, "male", "Account", 2017, 75000);
        EmployeeData1 emp6 = new EmployeeData1(8, "Geetika Chauhan", 30, "female", "Admin", 2016, 90000);

        List<EmployeeData1> employees = new ArrayList<EmployeeData1>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);

        Map<String, Long> count = employees.stream()
                .collect(Collectors.groupingBy(EmployeeData1::getDepartment, Collectors.counting()));

        System.out.println(count);

        // employees.stream().collect(Collectors.groupingBy(e -> e.getGender(),
        // Collectors.averagingDouble(e -> e.getSalary())));////why this is not working
        // as lamda expression ended so again we have to start lamda if want to use
        // otherwise we can use function referencing
        // as lamda expression ends there only again we required a

        Map<String, Double> data = employees.stream().collect(
                Collectors.groupingBy(e -> e.getGender(), Collectors.averagingDouble(EmployeeData1::getSalary)));

        System.out.println(data);

        // Get the details of the highest-paid employee in the organization from the
        // given list of employees.

        Comparator<EmployeeData1> comparedBySalary = (obj1, obj2) -> (int) obj1.getSalary() - (int) obj2.getSalary();
        Collections.sort(employees, comparedBySalary);
        System.out.println(employees.get(0));

        employees.stream().sorted(comparedBySalary).limit(1).forEach(emp -> System.out.println(emp));

        // Get the average age of each department in an organization.
        Map<String, Double> averageAge = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.averagingInt(EmployeeData1::getAge)));
        System.out.println(averageAge);

        // Find out who is the senior-most employee in the organization in terms of
        // experience.
        Optional<EmployeeData1> mostExperiencedEmployee = employees.stream()
                .min(Comparator.comparingInt(EmployeeData1::getAge));
        System.out.println(mostExperiencedEmployee);

        // Get the details of the youngest employee in the organization.
        Optional<EmployeeData1> minorExperiencedEmployee = employees.stream()
                .max(Comparator.comparingInt(EmployeeData1::getAge));
        System.out.println(minorExperiencedEmployee);

        // Get the number of employees in each department if you have given a list of
        // employees.
        HashMap<String, Integer> personByDepartment = new HashMap<>();

        for (EmployeeData1 e : employees) {
            if (personByDepartment.containsKey(e.getDepartment()))
                personByDepartment.put(e.getDepartment(), personByDepartment.get(e.getDepartment()) + 1);
            else
                personByDepartment.put(e.getDepartment(), 1);
        }

        // int value1 = personByDepartment.get("Admin");
        // for (Map.Entry entry : personByDepartment.entrySet()) {
        // System.out.println(entry.getKey() + " " + entry.getValue());
        // }

        personByDepartment.forEach((key, value) -> System.out.println(key + " " + value));

        // Find out the number of male and female employees in the organization.

        Map<String, Long> genderCount = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
        System.out.println(genderCount);

    }

}
