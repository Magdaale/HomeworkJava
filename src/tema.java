import java.util.Scanner;

public class tema{

	public static void main(String[] args) {
		// PRINTEAZA NUMERE INTRE 1 SI 100
		
		int number;
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the number");
		number = scan.nextInt();
		
		////if(number >= 1 & number <= 100) {
			
		//	System.out.println(number);
		//}
		
		//else {
		//	System.out.println("nu este inclus in range");

       // }
		
		
			if (number % 15 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (number % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (number % 5 ==0) {
				System.out.println("Buzz");
			}
			else System.out.println(number);	
			}
		}		
      
	/*public void fizzBuzzGame() {
		for(int number2=1; number2<=100;number2++) {
		if (number2 % 15 == 0) {
			System.out.println("FizzBuzz");
		}
		else if (number2 % 3 == 0) {
			System.out.println(number2 + " " + "Fizz");
		}
		else if (number2 % 5 ==0) {
			System.out.println("Buzz");
		}
		else System.out.println("number2");	
		}
	}*/
	
	

