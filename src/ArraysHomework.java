import java.util.Arrays;

public class ArraysHomework {
//	1. Write a program to sum all the values of a given Array in Java.

	public static void main(String[] args) {
		int[] givenArray = {4,10,1,5};
		int sum = 0;
		
		for(int item: givenArray) {
			sum += item;
		}
		System.out.println(sum);

	}
	
//	2. What is the output?

	double[ ] exampleArray = {1,5,6,5,4,1};
    double maximum = exampleArray[0];
    int index = 0;

    for (int i = 1; i<exampleArray.length>; i++){

         if (exampleArray[ i ] > maximum) {

              maximum = exampleArray[ i ];
              index = i;

         }

    }
    System.out.println(index);
    
//	3. Write a public static method called "toPower" that takes in as parameters
//	two integers called size and power. The method should return an array of size
//	"size" with each array index raised to the value of "power." So, for example,
//	if we passed in "size = 4" and "power = 2" to the "toPower," the method should
//	return the following result: [0,1,4,9].

    public static int[] toPower(Integer size, Integer power) {
    	int[] toPowerArray = new int[size];
    	for (int index: toPowerArray) {
    		Math.pow(index, power);
    		toPowerArray[index] = (int)index;
    	}
    	return toPowerArray;
    }
    System.out.println(this.toPower(4, 2));
     
}