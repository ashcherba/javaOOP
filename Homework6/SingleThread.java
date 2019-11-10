package Homework6;

import java.math.BigInteger;

public class SingleThread implements Runnable {
	
	private Thread thread;
	private int i;
	
	SingleThread(int i){
		super();
		thread = new Thread(this);
		i = this.i;
	}
	
	public Thread getThread() {
		return thread;
	}

	@Override
	public void run() {
		BigInteger factorial = new BigInteger("1");
	
        for (int j = 1; j <= 100; j++) {
            factorial = factorial.multiply(BigInteger.valueOf(j));
            System.out.println("Factorial of current thread equals: " + factorial);
        }
	}

}
