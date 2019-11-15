interface Calc{
	//public abstract int add(int x, int y);
	 int add(int x, int y);
}
// 1st way to use
class MyCalc implements Calc{
	@Override
	public int add(int x,int y) {
		return x + y;
	}
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc obj = new MyCalc();
		int result = obj.add(10,20 );
		System.out.println(result);
		
		// 2nd Way Anonymous Class
		Calc p = new Calc() {
			@Override
			public int add(int x,int y) {
				return x + y;
			}
		};
		result = p.add(90, 100);
		// 3rd Way Lambda Expression
		Calc p2 = (x,y)->x+y;
		Calc p3 = (x,y)->{
			System.out.println("X is "+x+ "and y is "+y);
			return x + y;
		};

	}

}
