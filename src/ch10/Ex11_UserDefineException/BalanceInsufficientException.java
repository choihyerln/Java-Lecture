package ch10.Ex11_UserDefineException;

public class BalanceInsufficientException extends RuntimeException {
	BalanceInsufficientException() { }

	BalanceInsufficientException(String message) {
		super(message);
	}
}