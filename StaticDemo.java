import static java.lang.System.out;
class Emp{
	int id; //instance variable
	String name;//instance variable
	static int count;//class variable
	int count2;//instance variable
	static {
		count=100;
		//count2=100;
		out.println("i will run only once during class load");
	//System.exit(0);
	}
	
	
	Emp(){
		//id=100;
		name="Ram";
		count++;
		
		System.out.println("i will run when object create"+count);
		
		
	}
	void show() {
		count++;
		count2++;
	}
	static void print() {
		System.out.println("I am print");
	}
}
class Mathematics{
	private Mathematics(){
		
	}
	static void sin(){
		System.out.println("Maths sin");
	}
	static void cos(){
		System.out.println("Maths cos");
	}
}
public class StaticDemo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp.print();
		Mathematics.sin();
		//Mathematics maths = new Mathematics();
	//	maths.sin();
		Emp emp=new Emp();
		//System.out.println(emp.id);
		Emp emp1=new Emp();
	

	}

}
