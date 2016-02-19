package banking.primitive.core;


public interface AccountServerFactory {
	
	public static AccountServer lookup() {
		return new ServerSolution();
	}
}
