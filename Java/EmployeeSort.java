import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import utils.IntegerValidator;

class Employee {
    
    String Name;
    String Dept;
    int Salary;

    public Employee(String Name, String Dept, int Salary){
        this.Name = Name;
        this.Dept = Dept;
        this.Salary = Salary;
    }

}

public class EmployeeSort{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Employee> listDept = new ArrayList<>(); 
        List<Employee> listSal = new ArrayList<>(); 
        
        System.out.println("Enter the number of Employees:");
        int no = IntegerValidator.validateInteger(sc);
        for(int i=0;i<no;i++){
            sc.nextLine();
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.println("Enter your department:");
            String dept = sc.nextLine();
            System.out.println("Enter your salary:");
            int salary = IntegerValidator.validateInteger(sc);
            Employee emp = new Employee(name,dept,salary);
            listDept.add(emp);
            listSal.add(emp);
        }
        listDept.sort(new Comparator<Employee>(){
            public int compare(Employee a, Employee b){
                return a.Dept.compareTo(b.Dept);
            }
        });
        listSal.sort(new Comparator<Employee>(){
            public int compare(Employee a, Employee b){
                return Integer.compare(b.Salary,a.Salary);
            }
        });
        //Display the employees according to ascending order department
        Iterator<Employee> deptIterator = listDept.iterator();
        while(deptIterator.hasNext()){
            Employee emp = deptIterator.next();
            System.out.println("Employee Name:"+emp.Name+" Employee Department:"+emp.Dept+" Employee Salary:"+emp.Salary);
        }
        System.out.println("=======================");
        //Display the employees according to descending order of salary
        Iterator<Employee> salIterator = listSal.iterator();
        while(salIterator.hasNext()){
            Employee emp = salIterator.next();
            System.out.println("Employee Name:"+emp.Name+" Employee Department:"+emp.Dept+" Employee Salary"+emp.Salary);
        }
        sc.close();
    }
}
