package com.shrenik.example;

import java.sql.SQLException;

public class CustomExceptionHandler  extends Exception {
	
	public int errorCode;
	public String errorMsg;
	
	public CustomExceptionHandler() {
		errorCode = -1;
		errorMsg = "#UnknownErrrorMessage";
	}

	public CustomExceptionHandler(int errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	// user defined
	public CustomExceptionHandler  handleException(Object ex)
	{
		if(ex instanceof SQLException)
		{
			this.errorCode = 1;
			this.errorMsg = "SQL Syntax Error.";
		}
		else if(ex instanceof ClassCastException)
		{
			this.errorCode = 2;
			this.errorMsg = "Invalid operation class cast.";
		}
		else if(ex instanceof ArrayIndexOutOfBoundsException)
		{
			this.errorCode = 3;
			this.errorMsg = "Invalid Array Index to print Value";
		}
		
		return this;		
	}

	@Override
	public String toString() {
		return "CustomExceptionHandler [errorCode=" + errorCode + ", errorMsg=" + errorMsg + "]";
	}
	
}
