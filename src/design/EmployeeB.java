
package design;

import design.Employee;

public abstract class EmployeeB implements Employee {

    private int employeeID, Salary;
    private String employeeName;
    private boolean employedOrNot;
    int rate;
    int hoursWorked;

    //employeeId() will return employee id.
    public int employeeId(int employeeID){
        this.employeeID=employeeID;
        return employeeID;
    };

    //employeeName() will return employee name
    public String employeeName(String employeeName){
        this.employeeName=employeeName;
        return employeeName;

    };

    //assignDepartment() will assign employee to departments
    public void assignDepartment(){

    };

    //calculate employee salary
    public int calculateSalary(int rate, int hoursWorked){
        int salary;
        salary=rate*hoursWorked;
        return salary;
    };

    //employee benefit
    public void benefitLayout(){
        System.out.println("Ha! You thought!");
    };

    //
//    public boolean employedYorN(String YorN){
//
//            if(String YorN.contains("Y")){
//                return true;
//        }
//    };
}

