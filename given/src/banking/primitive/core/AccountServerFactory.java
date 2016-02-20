package banking.primitive.core;

/**
 * File: AccountServerFactory.java
 * Author: unknown
 * Date: unknown
 *
 * Description: Factory class for creating a new account.
 */
public class AccountServerFactory {
	
	public static AccountServer lookup() {
		return new ServerSolution();
	}
}
