package ch08;

public class _09_GenericPrinter<T> {
		
		private T material; //T자료형변수
		
		//T :_09_Powder
		public void setMaterial(T material) { 
			this.material=material; //주소값을 넘겨줌 
		}
		
		public T getMaterial() {
			return this.material;
		}
		
		@Override
		public  String toString() {
			return material.toString();
		}
		
}
