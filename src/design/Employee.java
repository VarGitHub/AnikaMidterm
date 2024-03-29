package design;

public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
   //please read the following method and understand the business requirements of these following methods
   //and then implement these in a concrete class.

   void setBaseSalary(int newSal);

   //employeeId() will return employee id.
   int employeeId();

   //employeeName() will return employee name
   String employeeName();

   String getDepartmentName();

   //calculate employee salary
   int calculateTotalSalary(int numberOfYearsWithCompany);

}
