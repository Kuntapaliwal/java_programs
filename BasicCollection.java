package java_programs;

import java.util.ArrayList;
import java.util.List;

class EmployeesData {
    protected long employeeId;
    protected String firstName;
    protected String lastName;

    public EmployeesData(long employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    boolean isEqual(EmployeesData other) {

        if (this.employeeId != other.employeeId && this.firstName != other.firstName)
            return false;
        else
            return true;
    }

}

public class BasicCollection {
    public static void main(String[] args) {
        EmployeesData employees1 = new EmployeesData(123, "john", "jack");
        EmployeesData employees2 = new EmployeesData(132, "jack", "John");
        EmployeesData employees3 = new EmployeesData(143, "james", "johnJack");

        List<EmployeesData> employeeList = new ArrayList<>();
        employeeList.add(employees1);
        employeeList.add(employees2);
        employeeList.add(employees3);

        employeeList.forEach(System.out::println);
        employeeList.forEach(e -> System.out.println(e));

    }

}
