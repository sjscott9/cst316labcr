package banking.primitive.core;

/**
 * File: AccountServerFactory.java
 * Author: unknown
 * Date: unknown
 *
 * Description: Factory class for creating a new account.
 */
public class AccountServerFactory {

	protected static AccountServerFactory singleton = null;

	protected AccountServerFactory() {

	}

	public static AccountServerFactory getMe() {
		if (singleton == null) {
			singleton = new AccountServerFactory();
		}

		return singleton;
	}

	public AccountServer lookup() {
		return new ServerSolution();
	}
}
