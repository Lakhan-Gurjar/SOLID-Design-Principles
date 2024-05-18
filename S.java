/* 
The design principle used in the provided code is the Single Responsibility 
Principle(SRP).

The Single Responsibility Principle states that a class should have only 
one reason to change. Each class should encapsulate only one responsibility 
or aspect of the program's functionality.

Each class encapsulates and manages its own distinct responsibility 
without being concerned with other unrelated tasks. This adherence to the 
Single Responsibility Principle improves maintainability, readability, and 
flexibility of the codebase.

 */
class Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Employee (String name, double hourlyRate, int hoursWorked){
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double calculatePay(){
        /* calculates Pay of an Enployee */
        return hourlyRate * hoursWorked;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}

class EmployeeRepository {
    public void saveEmployee(Employee employee) {
        /* Saves details of employee in Database */
        System.out.println("Saving employee: "+employee.getName());
        System.out.println("Hourly rate: Rs. "+employee.getHourlyRate());
        System.out.println("Hours worked: "+employee.getHoursWorked());
        System.out.println("Total pay: Rs. "+employee.calculatePay());
        System.out.println("Employee details saved successfully.\n");
    }
}
public class S {
    public static void main (String args[]){
        Employee employee1 = new Employee("Lakhan Gurjar", 500, 9);
        EmployeeRepository repository = new EmployeeRepository();
        repository.saveEmployee(employee1);
    }
}
