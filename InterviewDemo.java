class A1
{
	 void show() {
		System.out.println("A1 Show");
	}
	 A1(int x){
		 System.out.println("Parent Param Cons");
	 }
}

class B2 extends A1{
	B2(){
		super(1000);
	}
	@Override
	protected void show() {
		System.out.println("B2 Show");
	}
	// Var - Args
	// single var args allowed only in a one function
	// and var args always a end parameter
	static void add(String x, int ...y) {
		
	}
	static int sum(int ...x) {
		int total = 0;
		for(int i : x) {
			total+=i;
		}
		return total;
	}
}
public class InterviewDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = B2.sum(10,20,30,40,50,60);
		System.out.println(result);
		result = B2.sum();
		System.out.println(result);
		result =B2.sum(1,2,3);
		System.out.println(result);
	}

}
