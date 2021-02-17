package practice;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요: ");
		int dan = scan.nextInt();
		
		for(int i=2; i<10; i++) {
			System.out.println(i + "단");
			for(int j=1; j<10; j++) {
			System.out.println(i +" * " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
		for(int i=2; i<dan; i++) {
			System.out.println(dan + " 단");
			for(int j=1; j<10; j++) {
				System.out.println(dan+"*"+j+" = " + (dan*j));
			}
			System.out.println();
		}
		
		for( ;  dan < 10; dan++) {
			System.out.println(dan + "단");
			for(int j=1; j<10; j++ ) {
				System.out.println(dan +" * " + j + " = " + (dan * j));
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
