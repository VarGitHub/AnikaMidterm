package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
   public static void main(String[] args) {
      //Write Unit Test for all the methods has been implemented in this package.
      EmployeeInfo f = new FinanceEmployee("Anika", 4523, 100000);

      Assert.assertEquals(f.calculateTotalSalary(4), 100000);
      f.setPerformance("poor");
      Assert.assertEquals(f.calculateTotalSalary(4), 105000);
      Assert.assertEquals(f.getDepartmentFloor(), 6);
      Assert.assertEquals(f.employeeId(), 4523);
      Assert.assertEquals(f.employeeName(), "Anika");
      Assert.assertEquals(f.getDepartmentName(), "Finance");

      EmployeeInfo h = new HREmployee("David", 253, 40000);
      Assert.assertEquals(h.getDepartmentName(), "Human Resources");
      Assert.assertEquals(h.getDepartmentFloor(), 10);
   }
}
