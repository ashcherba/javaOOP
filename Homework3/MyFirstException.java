package Homework3;

public class MyFirstException extends Exception {


	@Override
	public String getMessage() {
		return "This item is superfluous. Please, delete an existing element in order to fit this";
	}
	
}
