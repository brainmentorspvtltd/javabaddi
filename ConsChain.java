class A{
	int x =1000;
	A(){
		System.out.println("A Default Cons");
	}
	A(int x){
		this();
		System.out.println("A Param Cons Call");
	}
}
class B extends A{
	int x = 2000;
	B(){
		super(100);
		System.out.println("B Default Cons");
	}
	B(int x){
		this();
		//super(10000);
		System.out.println("B Param Cons Call");
		
	}
}
class C extends B{
	int x = 9000;
	C(){
		super(11);
		System.out.println("C Default Cons Call");
	}
	C(int x){
		this();
		int z = ((A)this).x + ((B)this).x + this.x + x;
		System.out.println("C Param Cons Call");
	}
}
public class ConsChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B obj = new B(100);
		//C obj = new C(1200);
		final int MAX_AGE = 25;
		int age = 21;
		if(age>MAX_AGE) {
			
		}
		new C(1200);
	}

}
