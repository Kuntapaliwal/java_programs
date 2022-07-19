package java_programs;

import javax.lang.model.util.ElementScanner14;

public class InheritanceProg {
    public static void main(String[] args) {
        Employee e = new Employee("john", 10000, 2021, "1234365739898");
        Person p = new Person("John");
        System.out.println("name: " + p.getName());
        System.out.println("year of joining: " + e.getYear());
        System.out.println("salary: " + e.getSalary());
        System.out.println("UANNumber: " + e.getUANNumber());
        Employee e2 = new Employee("mark", 1000, 2020, "1234995739898");
        Employee e3 = new Employee("mark", 1000, 2022, "1234909739898");

        System.out.println(e.isEquals(e2));
        System.out.println(e3.isEquals(e2));
        System.out.println("objects details");
        System.out.println(e);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(p);// overided toString method will called whenever object is printed bydefault if
                              // we will print object than it will print address and also some extra info
        Employee dummy = e;
        if (p.isEquals(e3)) {
            System.out.println("person works as employee");
        } else if (e.isEquals(e2)) {
            System.out.println("employee works as employee");
        } else if (dummy.isEquals(e)) {
            System.out.println("employee works as Dummy Addresses");
        } else {
            System.out.println("person not works as employee");
        }

        Employee[] eArray = { e, e2, e3 };
        bubbleSort(eArray, eArray.length);
        for (Employee eDAta : eArray) {
            System.out.println(eDAta);
        }

    }

    public static void bubbleSort(Employee[] sort_arr, int len) {

        for (int i = 0; i < len - 1; ++i) {

            for (int j = 0; j < len - i - 1; ++j) {

                if (sort_arr[j + 1].getSalary() < sort_arr[j].getSalary()) {

                    Employee swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j + 1];
                    sort_arr[j + 1] = swap;

                }
            }
        }
    }
}

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

    boolean isEquals(Employee e) {
        return this.getName().equals(e.getName());
    }
}

class Employee extends Person {
    private double salary;
    private int year;
    private String UANNumber;

    Employee(String name, double salary, int year, String UANNumber) {
        super(name);
        this.salary = salary;
        this.year = year;
        this.UANNumber = UANNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getUANNumber() {
        return UANNumber;
    }

    public void setUANNumber(String uANNumber) {
        UANNumber = uANNumber;
    }

    @Override
    boolean isEquals(Employee e) {
        if (this.equals(e))
            return true;
        else if (this.getSalary() == e.getSalary() && this.getYear() == e.getYear()
                && this.getUANNumber() == e.getUANNumber() && this.getName() == e.getName()) {
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return "Employee [UANNumber=" + UANNumber + ", salary=" + salary + ", year=" + year + "]";
    }

    @Override
    public int hashCode() {// this method will give the addresses by default.........................
        final int prime = 31;
        int result = 1;
        result = prime * result + ((UANNumber == null) ? 0 : UANNumber.hashCode());
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + year;
        return result;
    }

    @Override
    public boolean equals(Object obj) {// this method is default equal method we can override these methods as per opur
                                       // convinious
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (UANNumber == null) {
            if (other.UANNumber != null)
                return false;
        } else if (!UANNumber.equals(other.UANNumber))
            return false;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        if (year != other.year)
            return false;
        return true;
    }

}
