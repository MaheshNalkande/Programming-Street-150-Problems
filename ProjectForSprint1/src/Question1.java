import java.util.Scanner;

public class Question1 {
//Write a program to check whether a number is even or odd.
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number to check if it is even or odd.");
		
		int number = s.nextInt();
		
		if(number%2==0)
			System.out.println(number +" is even");
		else 
			System.out.println(number+" is odd");
	}

}
