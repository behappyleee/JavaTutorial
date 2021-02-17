package ch07;

public class _04_CompleteCalc extends _04_Calculator {
	
				public int times(int num1, int num2) {
					return num1*num2;
				}
		
				public int divide(int num1, int  num2 ) {
					if(num2 != 0 ) {
						return num1/num2;
					} 	else {
					return  _04_Calc.ERROR ;
				}
				}
				
				public void printInfo() {
					System.out.println("interface complete");
				}
				
		
}