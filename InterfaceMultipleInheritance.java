interface IPlayer{
	void jump();
	void run();
	int MAX_POWER = 100;
}
interface StarPlayer{
	int MAX_POWER = 200;
	void hide();
	void changeSize();
	void run();
}
interface HybridPlayer extends IPlayer, StarPlayer{
	
}
public class InterfaceMultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
