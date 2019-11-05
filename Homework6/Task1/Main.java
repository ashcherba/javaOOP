package Homework6.Task1;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
            new Thread(new SingleThread()).start();
        }

	}

}

