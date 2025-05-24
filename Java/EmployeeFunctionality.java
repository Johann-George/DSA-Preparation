import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {

  int employeeID;
  String employeeName;
  String employeeDept;

  public Employee(int employeeID, String employeeName, String employeeDept) {
    this.employeeID = employeeID;
    this.employeeName = employeeName;
    this.employeeDept = employeeDept;
  }

}

class EmployeeFunctionality {

  HashMap<Integer, Employee> map = new HashMap<>();

  public static void main(String[] args) {
    EmployeeFunctionality emp = new EmployeeFunctionality();
    emp.func();
  }

  public void func() {

    Scanner sc = new Scanner(System.in);
    int cont = 1;
    while (cont != 0) {
      System.out.println("1.Add Employee\n2.Search Employee\n3.Display Employees");
      System.out.println("Enter the operation you want to perform:");
      int op = sc.nextInt();
      switch (op) {
        case 1:
          addEmp(sc);
          break;
        case 2:
          searchEmp(sc);
          break;
        case 3:
          displayEmp();
          break;
        default:
          System.out.println("Enter a valid input");
          break;
      }
      System.out.println("Do you want to continue(1/0):");
      cont = sc.nextInt();
    }

  }

  public void addEmp(Scanner sc) {

    System.out.println("Enter the employee details:");
    System.out.println("Enter the employee ID:");
    int empId = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the employee Name:");
    String empName = sc.nextLine();
    System.out.println("Enter the employee department:");
    String empDept = sc.nextLine();
    Employee emp = new Employee(empId, empName, empDept);
    map.put(empId, emp);

  }

  public void searchEmp(Scanner sc) {

    System.out.println("Enter the employee ID:");
    int empId = sc.nextInt();
    for (Map.Entry<Integer, Employee> e : map.entrySet()) {
      if (e.getKey() == empId) {
        System.out.println("Employee found!");
        System.out.println(
            "Employee Name:" + e.getValue().employeeName + "\nEmployee Department:" + e.getValue().employeeDept);
      }
    }

  }

  public void displayEmp() {

    for (Map.Entry<Integer, Employee> e : map.entrySet()) {
      System.out
          .println("Employee Name:" + e.getValue().employeeName + "\nEmployee Department:" + e.getValue().employeeDept);
      System.out.println("================================");
    }

  }

}
