abstract class Loan{
//final class Loan{
//class Loan{
	
	final String bankName;
	double balance;
	int id;
	String name;
	Loan(){
		bankName="SBI";
		System.out.println("loan class constructor call");
	}
	abstract void emi();
	//void emi() {
//		System.out.println("Loan EMI ");
//	}
 //final void tenure() {
	 void tenure() {
		System.out.println("Generic Tenure");
	}
}
class HomeLoan extends Loan{
	@Override
	void emi() {
		System.out.println("HomeLoan emi");
	}
	HomeLoan(){
		System.out.println("homeloan class constructor call");
	}
	
	
	void ballonPayment() {
		System.out.println("Home Loan Ballon Payment");
	}
	
	@Override
	void tenure() {
		super.tenure();
		System.out.println("Home Loan Tenure is High");
	}
}
class AutoLoan extends Loan{
	@Override
void tenure() {
		System.out.println("Auto Loan Tenure is Low");
	}

	@Override
	void emi() {
		// TODO Auto-generated method stub
		
	}
}
class LoanCaller {
	void call(Loan loan){
		loan.emi();
		loan.tenure();
		if(loan instanceof HomeLoan) {
			HomeLoan obj = (HomeLoan)loan; // DownCasting
			obj.ballonPayment();
		}
		System.out.println("********************");
	}
}

public class UpcastingDownCasting {

	public static void main(String[] args) {
		LoanCaller caller =new LoanCaller();
		caller.call(new HomeLoan());
		//caller.call(new AutoLoan());
		// TODO Auto-generated method stub
		//Loan loan = new HomeLoan();
		// Human hanuman = new SuperHuman();
//		Loan loanObject = new HomeLoan(); // Upcasting
//		loanObject.emi();
//		loanObject.tenure();
		//loanObject.ballonPayment();
//		loanObject = new AutoLoan();
//		loanObject.emi();
//		loanObject.tenure();
//		HomeLoan loan = new HomeLoan();
//		loan.emi(); // Generic
//		loan.tenure();
//		loan.ballonPayment(); // Special
//		System.out.println("**************");
//		AutoLoan loan2 = new AutoLoan();
//		loan2.emi();
//		loan2.tenure();
		

	}

}
