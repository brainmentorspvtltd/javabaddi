import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = s.nextInt();
		System.out.println("Enter the Name");
		String name = s.next();
		System.out.println("Enter the Basic Salary ");
		double basicSalary = s.nextDouble();
		//Employee emp = new Employee();
		Employee emp = new Employee(id, name, basicSalary);
		//emp.takeInput(id, name, basicSalary);
		emp.print();
		emp = null;
		System.gc();
		for(int i = 1; i<=10; i++) {
			System.out.println("I is "+i);
		}
		
		s.close();

	}

}
