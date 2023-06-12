package com.app.exception;

@SuppressWarnings("serial")
public class MedicationNotFoundException  extends Exception{
	
	public MedicationNotFoundException(String message) {
		super(message);
	}

	
	 public MedicationNotFoundException(String message, Throwable cause) {
	        super(message, cause);
	    }
}
