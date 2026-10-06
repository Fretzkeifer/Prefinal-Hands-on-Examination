/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longakitemployeepayroll;

/**
 *
 * @author User
 */
public class PartTimeFaculty extends Employee {
   private double hoursWorked;
   private double hourlyRate;

   public PartTimeFaculty(String employeeId, String name, String department, double hoursWorked, double hourlyRate) {
      super(employeeId, name, department);
      this.hoursWorked = hoursWorked;
      this.hourlyRate = hourlyRate;
   }

   public double getHoursWorked() {
      return this.hoursWorked;
   }

   public void setHoursWorked(double hoursWorked) {
      this.hoursWorked = hoursWorked;
   }

   public double getHourlyRate() {
      return this.hourlyRate;
   }

   public void setHourlyRate(double hourlyRate) {
      this.hourlyRate = hourlyRate;
   }

   public double calculateSalary() {
      return this.hoursWorked * this.hourlyRate;
   }

   public void displayFacultyType() {
      System.out.println("Employee Type\t: Part-Time Faculty");
   }
}
