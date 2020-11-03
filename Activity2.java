package Java_Act2;
import java.util.*;
public class Activity2 {
public static void main(String[] args) {
	      int[] numArr = {10, 11, 12, 13, -14, 10};
	      System.out.println("Original Array: " + Arrays.toString(numArr));
	        
	   int a = 10;
	   int b = 30;
     System.out.println("Result: " + result(numArr, a, b));
	    }

	    public static boolean result(int[] numbers, int a, int b) {
	        int c = 0;
	      
	        for (int number : numbers) {
	            
	            if (number == a) {
	              
	                c += a;
	            }
if (c > b) {
	                break;
	            }
	        }

	        return c == b;
	    }
	}

