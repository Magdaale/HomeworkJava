package Tema;

public class Tema2 {
	
	
	public static void main(String[] args) {
		
		Tema2 tema2 = new Tema2();
		tema2.parSauImpar(23);
		
	}
		
	public void parSauImpar(int number) {
		if(number % 2 ==0) {
			System.out.println(number + " " + "este par");
		}
		else {System.out.println(number + " " + "este impar");
		
		}
		
	
	}

}
