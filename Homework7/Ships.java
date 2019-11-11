package Homework7;

import java.util.Arrays;

public class Ships implements Runnable {
	
	private String name;
	public int numberOfBoxes = 10;
	public int[] docks = new int[2];
	
	public Ships() {
		super();
	}
	
	public Ships(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Ships [name=" + name + ", numberOfBoxes=" + numberOfBoxes + ", docks=" + Arrays.toString(docks) + "]";
	}

	@Override
	public void run() {
		
		Thread thread = Thread.currentThread();
		
			int counter = 0;
			for (int i = 0; i < numberOfBoxes; i++) {
				System.out.println("Left to upload " + (i + 1) + " boxes from " + name);
				counter++;
				try {
					Thread.currentThread().sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (numberOfBoxes == counter) {
				System.out.println(name + " is fully unloaded");
			}
		}

}
