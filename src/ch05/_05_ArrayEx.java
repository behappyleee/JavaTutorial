package ch05;

public class _05_ArrayEx {
			public static void main  (String[ ] args) {
				
				
				int [ ] [ ] arr = {
						{1 , 2, 3},   // 0행
						{4,  5, 6}	  //  1행
				                          };
																// 행(i) -> 배열의 길이 0행 : (0열)1, (1열)2, (2열)3
																// 열(j)  ->행의 길이      1행 : (0열)4, (1열)5, (2열)6
				for(int i = 0; i < arr.length ; i++ ) {        // arr.length=2    
					for(int j =0;  j < arr[i].length; j++) { //  arr[i].length=3
						System.out.println(" i  :  " + i + " j  " + j +" = " +  arr [ i ] [ j ]);
					}
					System.out.println();
				}
				
				System.out.println("--------------------------------");
				
				
				
					
				
				
				
				
				
				
				
				
			}
}
