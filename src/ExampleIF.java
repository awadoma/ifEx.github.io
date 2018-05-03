import java.util.Scanner;

public class ExampleIF {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener Number1");
		int numb1 = sc.nextInt();
		System.out.println("Ener Number2");
		int numb2 = sc.nextInt();
		
		if( numb1 > numb2) {
			System.out.println("Number1 is greate");
		}else {
			System.out.println("Number2 is greate");
		}
		*/
		/*
		 // if else condition avec String
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener Firest Color");
		String color1 = sc.next();
		System.out.println("Ener Second Color");
		String color2 = sc.next();
		
		if( color1.equals(color2)) {
			System.out.println("The Tow color is Equel");
		}else {
			System.out.println("The Tow color is Not Equel");
		}
		*/
		//If else if condition
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener Greade");
		int Greade = sc.nextInt();
		char greadeMessage;
		if( Greade >= 90) {
			greadeMessage ='A';
		}else if(Greade >= 80) {
			greadeMessage ='B';
		}else if(Greade >= 70) {
			greadeMessage ='C';
		}else if(Greade >= 60) {
			greadeMessage ='D';
		}else if(Greade >=50){
			greadeMessage ='E';
		}else {
			greadeMessage ='F';
		}
		System.out.println("Greade Is"+" "+ greadeMessage);
		*/
		//conditional ternary operation
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener Greade");
		int g = sc.nextInt();
		String greade = (g >= 50 )? "passe" : "Faile";
	System.out.println(greade);
	}

}
