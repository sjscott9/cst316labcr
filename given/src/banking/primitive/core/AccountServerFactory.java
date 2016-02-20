package banking.primitive.core;


public class AccountServerFactory {
	
	public static AccountServer lookup() {
		return new ServerSolution();
	}
}
