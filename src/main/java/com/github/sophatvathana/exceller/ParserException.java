package com.github.sophatvathana.exceller;


public class ParserException extends RuntimeException {
	
	public ParserException(String message) {
		super(message);
	}
	
	public ParserException(String message, Exception exception) {
		super(message, exception);
	}
	
}