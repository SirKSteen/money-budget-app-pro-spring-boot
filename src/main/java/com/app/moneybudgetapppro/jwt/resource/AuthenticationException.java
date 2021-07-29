package com.app.moneybudgetapppro.jwt.resource;
public class AuthenticationException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = -93004819041793210L;

	public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
