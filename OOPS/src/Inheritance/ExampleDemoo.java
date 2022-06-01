package Inheritance;

import java.util.Scanner;

class Employee{
	private String name;
	private String joiningDate;
	private double salary;
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		name=name;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate( String joiningDate) {
		joiningDate=joiningDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		salary=salary;
	}
	public void raiseSalary(double percent){
		salary+=salary*percent/100;
		System.out.println("salary percent " +salary);
	}
	public void display(String name,double salary,String joiningDate) {
		System.out.println("Employee Name is "+name);
		System.out.println("Employee Salary is "+salary);
		System.out.println("Employee joining date is "+joiningDate);
	}
}

class Manager extends Employee{
	long bonus;
	Manager(String n,double s,long b){
		super(n, s);
		bonus=b;
	}
	long getBonus() {
		return bonus;
	}
	public void setBonus(long b) {
		bonus=b;
	}
	public double getSalary() {
		return super.getSalary()+bonus;
	}
	public void display() {
		super.display(getName(), bonus, getJoiningDate());
	}
}

public class ExampleDemoo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Employee emp1=new Employee("Ram",35000);
		emp1.raiseSalary(10);
		System.out.println("Employee Name "+emp1.getName());
		System.out.println("Employee salary "+emp1.getSalary());
		Manager m2=new Manager(input.next(),input.nextLong(),input.nextLong());
//		System.out.println("Employee Name "+m1.getName());
//		System.out.println(m1.getSalary());
//		System.out.println("Manager salary "+m1.getSalary());
//		System.out.println("Manager Bonus "+m1.getBonus());
//		m1.raiseSalary(10);
//		m1.display("RAJA", 30000, "23.12.2000");
//		
//		Employee e2=new Manager("Raj",20300,90);//Polymorphism
//		
		Employee[] emp=new Employee[5];//Dynamic Binding
		emp[0]=new Employee("Ram",35000);
		emp[1]=new Employee("Raj",7000);
		emp[2]=new Employee("Roj",44000);
		emp[3]=new Manager("John",40000,40);
		emp[4]=m2;
		Manager m1=new Manager(emp[3].getName(),emp[3].getSalary(),0);
		m1.setBonus(452000);
		System.out.println(m1.getBonus());
		System.out.println();
		for(Employee e:emp) {
			System.out.println(e.getName());
			System.out.println(e.getSalary());
		}
		
		
	}

}
