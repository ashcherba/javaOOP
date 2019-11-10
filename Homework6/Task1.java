package Homework6;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		SingleThread[] st = new SingleThread[100];

		
		for (int i = 0; i < st.length; i++) {
            st[i] = new SingleThread(i);
            Thread tr = new Thread(st[i]);
            tr.start();
        }

	}

}

