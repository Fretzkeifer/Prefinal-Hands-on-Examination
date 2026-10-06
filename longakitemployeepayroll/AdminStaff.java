/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longakitemployeepayroll;

/**
 *
 * @author User
 */
public class AdminStaff extends Employee {
   private double basicSalary;
   private double overtimePay;

   public AdminStaff(String employeeId, String name, String department, double basicSalary, double overtimePay) {
      super(employeeId, name, department);
      this.basicSalary = basicSalary;
      this.overtimePay = overtimePay;
   }

   public double getBasicSalary() {
      return this.basicSalary;
   }

   public void setBasicSalary(double basicSalary) {
      this.basicSalary = basicSalary;
   }

   public double getOvertimePay() {
      return this.overtimePay;
   }

   public void setOvertimePay(double overtimePay) {
      this.overtimePay = overtimePay;
   }

   public double calculateSalary() {
      return this.basicSalary + this.overtimePay;
   }

   public void displayStaffType() {
      System.out.println("Employee Type\t: Administrative Staff");
   }
}
