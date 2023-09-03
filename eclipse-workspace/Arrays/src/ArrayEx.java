import java.util.*;


public class ArrayEx {
		
//  Write a program to sum all the values of a given Array in Java.
	
	public static int getSum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
//	What is the output?
//          double[ ] exampleArray = {1,5,6,5,4,1};

//          double maximum = examplesArray[0];

//	          int index = 0;

//	          for (int i = 1; i<exampleArray.length>; i++){

//	               if (exampleArray[ i ] > maximum) {

//	                    maximum = exampleArray[ i ];

//	                    index = i;

//            }

//         }

//	          System.out.println(index);
	
//	Write a public static method called "toPower" that takes in as parameters two integers 
//	called size and power. The method should return an array of size "size" with each array 
//	index raised to the value of "power." So, for example, if we passed in "size = 4" and "power = 2"
//	to the "toPower," the method should return the following result: [0,1,4,9].
	
		public static int[] toPower(int size, int power) {
			int[] reqArray = new int[size];
			
			for(int i = 0; i < size; i++) {
				reqArray[i] = (int) Math.pow(i, power);
			}
			return reqArray;
		}
		
		public static void main(String[] args) {
			int[] theArray = {6,4,1,8,3,5,2};
			System.out.println(Arrays.toString(toPower(4, 2)));
			System.out.println(getSum(theArray));
		}

 }
