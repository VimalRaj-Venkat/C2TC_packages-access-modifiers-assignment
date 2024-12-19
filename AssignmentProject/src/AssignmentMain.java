import com.vimalraj.assignment.employees.Manager;
import com.vimalraj.assignment.employees.Developer;
import com.vimalraj.assignment.utilities.EmployeeUtilities;
public class AssignmentMain {
	public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Alice");
        manager.setEmployeeId(101);
        manager.setSalary(80000);
        manager.setDepartment("IT");

        Developer developer = new Developer();
        developer.setName("Bob");
        developer.setEmployeeId(102);
        developer.setSalary(75000);
        developer.setProgrammingLanguage("Java");

        EmployeeUtilities utilities = new EmployeeUtilities();

        System.out.println("Manager Information:");
        utilities.displayEmployeeInfo(manager);
        utilities.displayManagerInfo(manager);

        System.out.println("\nDeveloper Information:");
        utilities.displayEmployeeInfo(developer);
        utilities.displayDeveloperInfo(developer);
    }
}
