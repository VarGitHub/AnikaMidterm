package design;

public class FinanceEmployee extends EmployeeInfo {

   public FinanceEmployee(String name, int employeeId, int baseSalary) {
      super(name, employeeId, baseSalary);
      departmentName = "Finance";
   }

   public int getDepartmentFloor() {
      return 6;
   }

   public void setPerformance(String perform) {
      PerformanceCheck p = new PerformanceCheck(perform);
   }


   private class PerformanceCheck {
      PerformanceCheck(String perform) {
         String p = perform.toLowerCase();

         switch (p) {
            case "poor":
               performance = Performance.POOR;
               break;
            case "average":
               performance = Performance.AVERAGE;
               break;
            case "best":
               performance = Performance.BEST;
               break;
            default:
               performance = Performance.NOTDETERMINED;
               break;
         }
      }
   }
}
