package org.test;



public class Singleton {
	static Singleton in;
	private static Singleton add() {
		if (in==null) {
			System.out.println(System.identityHashCode(in));
			
			in = new Singleton();
			System.out.println(System.identityHashCode(in));
			System.out.println("New Siva Branch Added");
			
		}

		return in;
		

	}
	public static void main(String[] args) {
		Singleton add = in.add();
		System.out.println(System.identityHashCode(add));
		
		Singleton add2 = in.add();
		System.out.println(System.identityHashCode(add2));
	}
		
		
	

}



