package design;

import java.util.Scanner;
public class EmployeeInfo1 implements Employee{


    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return "Elhacen";
    }

    @Override
    public void assignDepartment() {
        System.out.println("Please Enter Employee Position?");
        Scanner input = new Scanner(System.in);
        String position = input.nextLine();
    }

    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public void benefitLayout() {

    }
}
