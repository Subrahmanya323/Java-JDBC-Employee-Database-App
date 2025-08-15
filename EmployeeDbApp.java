package EmployeeDBApp;
import java.util.Scanner;

public class EmployeeDbApp {
    public static void main(String[] args) {
        Employee e = new Employee();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Employee Database App ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    sc.nextLine(); 
                    String name = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    e.addEmployee(name, salary);
                    break;

                case 2:
                    e.viewEmployees();
                    break;

                case 3:
                    System.out.print("Enter employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new salary: ");
                    double newSalary = sc.nextDouble();
                    e.updateEmployee(id, newName, newSalary);
                    break;

                case 4:
                    System.out.print("Enter employee ID: ");
                    int idToDelete = sc.nextInt();
                    e.deleteEmployee(idToDelete);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
