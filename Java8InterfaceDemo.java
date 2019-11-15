import java.io.Serializable;

interface I1{
	// public abstract void show();
	void show();
	public default void print() {
		System.out.println("I am Print");
	}
}
interface I2{
	void show();
	default void print() {
		System.out.println("I am Print2");
	}
}
interface I3 extends I1, I2{
	@Override
	default void print() {
		I1.super.print();
		I2.super.print();
		System.out.println("I am Print3");
	}
}
class K2 implements I1, I2{
	@Override
	public void show() {
		
	}
	@Override
	public void print() {
		I1.super.print();
		I2.super.print();
	}
}
class K1 implements I3{
	public void show() {
		System.out.println("I am Show");
	}
}
class A4 implements Cloneable{
	
}
class A3 implements Serializable{
	
}
public class Java8InterfaceDemo {

	public static void main(String[] args) {
		K1 obj = new K1();
		obj.show();
		obj.print();

	}

}
