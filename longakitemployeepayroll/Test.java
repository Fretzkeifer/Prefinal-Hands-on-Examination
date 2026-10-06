/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longakitemployeepayroll;

/**
 *
 * @author User
 */
public class Test {
   public Test() {
   }

   public static void main(String[] args) {
      FullTimeFaculty fullTime = new FullTimeFaculty("FT001", "Juan Dela Cruz", "Information Technology", (double)30000.0F, (double)5000.0F);
      PartTimeFaculty partTime = new PartTimeFaculty("PT001", "Maria Santos", "Business Administration", (double)120.0F, (double)150.0F);
      AdminStaff admin = new AdminStaff("AS001", "Pedro Garcia", "Finance", (double)25000.0F, (double)2500.0F);
      Employee[] employees = new Employee[]{fullTime, partTime, admin};
      displayHeader();

      for(Employee employee : employees) {
         displayEmployee(employee);
      }

      displaySummary();
   }

   public static void displayHeader() {
      System.out.println("==================================================");
      System.out.println("      DON JOSE ECLEO MEMORIAL COLLEGE");
       System.out.println("   P-5 Justiniana Edera, San Jose, Dinagat Islands   ");
      System.out.println("          EMPLOYEE PAYROLL SYSTEM");
      System.out.println("==================================================");
      System.out.println();
   }

   public static void displayEmployee(Employee employee) {
      employee.displayEmployeeInfo();
      if (employee instanceof FullTimeFaculty fullTimeFaculty) {
         fullTimeFaculty.displayFacultyType();
      } else if (employee instanceof PartTimeFaculty partTimeFaculty) {
         partTimeFaculty.displayFacultyType();
      } else if (employee instanceof AdminStaff adminStaff) {
         adminStaff.displayStaffType();
      }

      System.out.printf("Salary\t\t: PHP %,.2f%n", employee.calculateSalary());
      System.out.println("--------------------------------------------------");
      System.out.println();
   }

   public static void displaySummary() {
      System.out.println("==================================================");
      System.out.println("Total Employees: " + Employee.getEmployeeCount());
      System.out.println("==================================================");
   }
}
