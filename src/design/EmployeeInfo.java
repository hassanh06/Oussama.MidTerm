package design;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class EmployeeInfo extends EmployeeInfo1{

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */

	public final static String companyName = "T2 Systems";
	private static double salary;
	private int employeeID;
	private  String employeeName;
	private int yearsWorked;

	//overriding the abs method
	@Override
	public String employeeName() {
		return this.employeeName;
	}
	//overridding abs salary
	@Override
	public double calculateSalary() {
		return this.salary;
	}

	public int getEmployeeID(){
		return this.employeeID;
	}

	public static double getSalary() {
		return salary;
	}

	public void updateSalary(double newSalary) {
		this.salary = newSalary;
	}

	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	//Must use this constructor
	public EmployeeInfo(int employeeId, String name, double salary){
		this.employeeID = employeeId;
		this.employeeName = name;
		this.salary = salary;
		System.out.println("Welcome to "+ companyName +" " + name +"!");
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static double calculateEmployeeBonus(double salary) throws ParseException {
		double total = 0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);
		int yearsInTotal = getDiffYears(convertedJoiningDate, convertedTodaysDate);
		System.out.println(yearsInTotal);
		if (yearsInTotal >= 20) {
			total = (salary * .1) + salary;
			System.out.println("You're doing an amazing job!");
			System.out.println("Your total salary with bonus this year is: " + total);
			return total;
		} else if (yearsInTotal >= 15 && yearsInTotal <= 19) {
			total = (salary * .08) + salary;
			System.out.println("You're doing an excellent job!");
			System.out.println("Your total salary with bonus this year is: " + total);
			return total;
		} else if (yearsInTotal >= 10 && yearsInTotal <= 14) {
			total = (salary * .06) + salary;
			System.out.println("You're doing a great job!");
			System.out.println("Your total salary with bonus this year is: " + total);
			return total;
		} else if (yearsInTotal >= 5 && yearsInTotal <= 9) {
			total = (salary * .04) + salary;
			System.out.println("You're doing an good job!");
			System.out.println("Your total salary with bonus this year is: " + total);
			return total;
		} else if (yearsInTotal >= 2 && yearsInTotal <= 4) {
			total = (salary * .02) + salary;
			System.out.println("You're doing an nice job!");
			System.out.println("Your total salary with bonus this year is: " + total);
			return total;
		} else {
			total += salary;
			System.out.println("You're doing well.");
			System.out.println("Your total salary this year is: " + total);
			return total;
		}
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public double calculateEmployeePension(double salary) throws ParseException {
		double total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);

		//implement numbers of year from above two dates
		int yearsInTotal = getDiffYears(convertedJoiningDate, convertedTodaysDate);
		System.out.println(yearsInTotal);
		if(yearsInTotal>=5){
			total = salary + (salary * (.35));
		}else if(yearsInTotal ==4){
			total = salary + (salary * (.20));
		}else if(yearsInTotal ==3){
			total = salary + (salary * (.15));
		}else if(yearsInTotal ==2){
			total = salary + (salary * (.10));
		}
		System.out.println(total);
		return total;
	}

	public static int getDiffYears(String first, String last) throws ParseException {

		SimpleDateFormat format = new SimpleDateFormat("MM/yyy");
		String date1 = first;
		String date2 = last;
		Date newDate1= format.parse(date1);
		Date newDate2= format.parse(date2);
		Calendar a = getCalendar(newDate1);
		Calendar b = getCalendar(newDate2);
		int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
		if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) ||
				(a.get(Calendar.MONTH) == b.get(Calendar.MONTH) && a.get(Calendar.DATE) > b.get(Calendar.DATE))) {
			diff--;
		}
		return diff;
	}

	public static Calendar getCalendar(Date date) {
		Calendar cal = Calendar.getInstance(Locale.CANADA);
		cal.setTime(date);
		return cal;
	}



	public void yearsWorked() {
		String yearsWorked = String.valueOf(this.yearsWorked);
	}

	@Override
	public void benefitLayout() {
		int yearsWorked = this.yearsWorked;

		if (yearsWorked < 1) {
			System.out.println("Sorry you don't have benefits, not enough years worked.");
		} else {
			System.out.println("You will have benefits for the years of services");
		}
	}

	private static class DateConversion {
		//constructor
		public DateConversion(Months months){}
		//return format ex: 1/2019
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}
		//months converted to month value
		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 7;
					break;
				case August:
					date = 8;
					break;
				case September:
					date = 9;
					break;
				case October:
					date = 10;
					break;
				case November:
					date = 11;
					break;
				case December:
					date = 12;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}