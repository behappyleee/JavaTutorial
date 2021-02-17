package test;

import java.util.Scanner;

public class  _04_Kukudan_while  {
	
	public  static void main (String [] args) {
		System.out.println( " ******7단 *******");
		Scanner scan = new Scanner (System.in);
		int dan;
		int i =1;
		int mul;
		System.out.print(" 단을 입력하세요 : " );
		dan = scan.nextInt();	
		
		while (i <=9 ){
		mul = dan * i;
		System.out.println ( dan + " * " + i + " = " + mul );
		i++;
         }
		scan.close( );  // scan close 안함  
          }
}	