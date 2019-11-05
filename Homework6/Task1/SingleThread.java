package Homework6.Task1;

import java.math.BigInteger;

public class SingleThread implements Runnable {
	
	private Thread thread;
	
	SingleThread(){
		super();
		thread = new Thread(this);
	}
	
	public Thread getThread() {
		return thread;
	}

	@Override
	public void run() {
		BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= 100; i++) {
            factorial = factorial.multiply(new BigInteger("" + i));
            System.out.println("Factorial of current thread equals: " + factorial);
        }
	}
}
