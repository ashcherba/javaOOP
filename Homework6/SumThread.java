package Homework6;

import java.util.Arrays;
import java.util.Scanner;

public class SumThread implements Runnable {

	private int sum;
	private int[] numbers;
	private Thread thread;
	
	public SumThread(int[] numbers) {
		this.numbers = numbers;
		this.thread = new Thread();
		thread.start();
	}
	
	public int getSum() {
		return sum;
	}
	
	public Thread getThread() {
		return thread;
	}
	
	public static int calculateArray(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
	}
	
	@Override
	public void run() {
		this.sum = calculateArray(numbers);
		System.out.println("Sum of the elements of the array : " + sum);
	}

}
