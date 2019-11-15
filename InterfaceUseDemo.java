interface ICard{
	 void balance() ;
	
}
class Card  implements ICard{
	@Override
	public void balance() {
		System.out.println("Credit Card Balance");
	}
	public void commission() {
		System.out.println("Credit Card commission");
	}
	public void interest() {
		System.out.println("Credit Card Interest");
	}
}
class ConsumerA{
	void call() {
		// Loosley Coupled
		ICard p = new Card(); // Upcasting
		p.balance();
//		Card pp = new Card(); // Tightly Coupled
//		pp.balance();
//		pp.commission();
//		pp.interest();
		//p.interest();
	}
}
class ConsumerB{
	void caller() {
//		Producer p = new Producer();
//		p.show();
	}
}
public class InterfaceUseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
