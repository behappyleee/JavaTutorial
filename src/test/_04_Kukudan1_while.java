package test;

public class _04_Kukudan1_while {
	public static void main (String [ ]  args) {

				int dan;
				int times;
				int mul;
			
				for(dan=2; dan<=9; dan++) {
					System.out.println(" ============");
					System.out.println(" *** " +dan + "단 *** ");
					System.out.println(" ============");
						for(times=1; times <=9; times++) {
							mul= dan * times;
							System.out.println(dan + " * " + times + " = " + mul);
						}
				}

		}

}
