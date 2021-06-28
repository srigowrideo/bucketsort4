package fibonacciseries;
import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Collections; 
import java.util.List; 
/* * Java Program sort an integer array using radix sort algorithm. * input: [80, 50, 30, 10, 90, 60, 0, 70, 40, 20, 50] * output: [0, 10, 20, 30, 40, 50, 50, 60, 70, 80, 90] * * Time Complexity of Solution: * Best Case O(n); Average Case O(n); Worst Case O(n^2). * */
public class bucketsort1 { 

public static void main(String[] args) 
{ System.out.println("Bucket sort in Java"); 
int[] input = { 80, 50, 30, 10, 90, 60, 0, 70, 40, 20, 50 }; 
System.out.println("integer array before sorting");
System.out.println(Arrays.toString(input));
// sorting array using radix Sort Algorithm 

System.out.println("integer array after sorting using bucket sort algorithm"); 
System.out.println(Arrays.toString(input)); } } }

	


private static int input (int[]) { int m = input[0]; 
for (int i = 1; i < input.length; i++) { if (m < input[1]) { m = input[0]; } } 
return new int[] { m, (int) Math.sqrt(input.length) };return 0;}

