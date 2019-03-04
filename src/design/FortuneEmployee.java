package design;

public class FortuneEmployee {

   /**
    * FortuneEmployee class has a main methods where you will be able to create Object from
    * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
    * to use with proper business work flow.Think as a Software Architect, Product Designer and
    * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
    * more to design an application that will meet for fortune 500 Employee Information
    * Services.
    *
    * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
    **/
   public static void main(String[] args) {
      EmployeeInfo financeEmployee = new FinanceEmployee("Anika", 4523, 90000);
      System.out.println(financeEmployee.calculateTotalSalary(3));
      financeEmployee.setPerformance("average");
      System.out.println(financeEmployee.calculateTotalSalary(3));
      // System.out.println(EmployeeInfo.calculateEmployeePension());

      EmployeeInfo hrEmployee = new HREmployee("David", 253, 40000);
      hrEmployee.setBaseSalary(45000);
      System.out.println("Department floor: " + hrEmployee.getDepartmentFloor());
      hrEmployee.setPerformance("best");
      System.out.println(hrEmployee.calculateTotalSalary(10));
   }
}
