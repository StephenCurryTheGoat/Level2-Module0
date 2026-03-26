package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] strings = {"hi", "hey", "hola", "howdy", "hello"};
		
		String[] strings2 = new String[5];
		strings2[0] = "hi";
		strings2[1] = "hey";
		strings2[2] = "hola";
		strings2[3] = "howdy";
		strings2[4] = "hello";
		
		String[] strings3 = new String[5];
		for(int i = 0 ; i < strings3.length; i++) {
			strings3[i] = "hi " + i;
		}
		
		
		//2. print the third element in the array
		System.out.println(strings[2]); 
		
		//3. set the third element to a different value
		strings[2] = "hi";
		//4. print the third element again
		System.out.println(strings[2]); 
		System.out.println();
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0 ; i < strings3.length; i++) {
			System.out.println( strings3[i] );
		}
		
		//6. make an array of 50 integers
		int[] ints = new int[50];
		Random ran = new Random();
		//7. use a for loop to make every value of the integer array a random number
	for(int i = 0; i<50; i++) {
	ints[i] = ran.nextInt(80);
		}
		//8. without printing the entire array, print only the smallest number in the array
	int smallest = 80;	
	for(int i = 0; i< ints.length; i++) {
		if(ints[i] < smallest) {
			 smallest = ints[i];
		}
	}
	System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
	for(int i = 0; i< ints.length; i++) {
	System.out.println(ran.nextInt(80));
	}
		//10. print the largest number in the array.
	int largest = -1;	
	for(int i = 0; i< ints.length; i++) {
		if(ints[i] > largest) {
			 largest = ints[i];
		}
	}
	System.out.println(largest);
	}
}
