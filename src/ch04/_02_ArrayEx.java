package ch04;

public class _02_ArrayEx {
			public static void main  (String[ ] args) {
			
						String [ ] drink = new String [5];
						
						drink[0]="coffee";
						drink[1]="juice";
						drink[2]="water";
						drink[3]="beer";
						drink[4]="pocari";
						
						for(int i=0 ; i < drink.length ; i++) {
							System.out.println(drink[i]);
						}
						
						System.out.println(" ========== ");
						
						String [ ] drink1= new String [ ] {"coffer", "juice", "water", "beer", "pocari"} ;
						
						for(int j = 0 ; j < drink1.length ; j++) {
							System.out.print(drink1[j] + " ");
						}	
				}
		
}
