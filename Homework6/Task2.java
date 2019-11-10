package Homework6;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		System.out.println("Enter the required size of the array :: ");
	      Scanner s = new Scanner(System.in);
	      int size = s.nextInt();
	      int myArray[] = new int [size];
	      System.out.println("Enter the elements of the array one by one ");

	      for(int i=0; i<size; i++){
	         myArray[i] = s.nextInt();
	      }
	      System.out.println("Elements of the array are: "+ Arrays.toString(myArray));
	      
	      System.out.println("Enter the number of threads:  ");
	      int threadNumber = s.nextInt();
	      
			for (int i = 0; i < threadNumber; i++) {
				
			    SumThread sumThread = new SumThread(myArray);
			    sumThread.run();
			      
		        long start = System.currentTimeMillis();
		        long sum2 = SumThread.calculateArray(myArray);
		        long stop = System.currentTimeMillis();
		        System.out.println((stop - start) + "ms" + " - method multiThreadSumm, Sum = " + sum2);
	        }
	      
	        long start = System.currentTimeMillis();
	        long sum1 = sumNew(myArray);
	        long stop = System.currentTimeMillis();
	        System.out.println((stop - start) + "ms" + " - Static method sum, Sum = " + sum1);

	}

	private static long sumNew(int[] myArray) {
        int sum = 0;
        for (int i: myArray) {
            sum += i;
        }
        return sum;
	}

}
