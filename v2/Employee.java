import java.text.NumberFormat;
import java.util.Locale;

public class Employee {
	private int id;
	private String name;
	private double basicSalary;
	private String companyName;
	Employee(){
		System.out.println("Welcome Employee");
		companyName="TCS";
		System.out.println("I am a Default constructor");
	}
	Employee(int id , String name, double basicSalary){
		this(); // Call Default Constructor
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	@Override
	protected void finalize() {
		System.out.println("Bye bye Employee");
	}
//	public void takeInput(int id, String name, double basicSalary) {
//		this.id = id;
//		this.name = name;
//		this.basicSalary = basicSalary;
//	}
	public double hra() {
		return basicSalary * 0.30;
	}
	public double da() {
		return basicSalary * 0.25;
	}
	public double ta() {
		return basicSalary * 0.20;
	}
	public double ma() {
		return basicSalary * 0.10;
	}
	public double pf() {
		return basicSalary * 0.05;
	}
	public double gs() {
		return basicSalary + hra() + ta () + da() + ma() - pf();
	}
	public double tax() {
		double grossSalary  = gs();
		if(grossSalary>=500000 && grossSalary<700000) {
			return 0.10;
		}
		else
		if(grossSalary>=700000 && grossSalary<900000) {	
			return 0.20;
		}
		else
		if(grossSalary>=900000) {
			return 0.30;
		}
		else
			return 0.0;
	}
	public double ns() {
		return gs() - tax();
	}
	public String formatting(double value) {
		Locale locale = new Locale("fr", "FR");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		return nf.format(value);
	}
	public void print() {
		System.out.println("********** Salary Slip of "+companyName+"  **********");
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Basic Salary "+basicSalary);
		System.out.println("HRA "+formatting(hra()));
		System.out.println("DA "+formatting(da()));
		System.out.println("TA "+formatting(ta()));
		System.out.println("MA "+formatting(ma()));
		System.out.println("PF "+formatting(pf()));
		System.out.println("GS "+formatting(gs()));
		System.out.println("TAX "+tax());
		System.out.println("NS "+formatting(ns()));
	}

}
