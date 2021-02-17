package ch07;
//자식 클래스
public class _02_CompleteCalc extends _02_Calculator{

			public _02_CompleteCalc() {}
			
			public _02_CompleteCalc(int num1, int  num2) {
				
			}
		
			@Override
			public void add(int num1, int num2) {
				int sum =  num1 + num2;
				System.out.println("두 수의 덧셈 : " + sum);
			}
		
			@Override
			public void mul(int num1, int num2) {
				int mul= num1* num2;
				System.out.println("두 수의 곱셈 : " + mul );
			}
			
			@Override
			public void sub(int num1, int num2) {
				int sub = num1- num2;
				System.out.println("두 수의 뺄셈 : "  + sub  );
			}
			
			@Override
			public void div(int num1,int num2) {
				int div  = num1/num2;
				System.out.println("두 수의 나눗셈 : " + div );
			}
			
			public void printInfo() {
				System.out.println("두 수의  합 : " +   "\n두수의 곱" + "\n두수의  나눗셈 : " + "\n두수의 뺏셈 : "   );
			}
				
}
