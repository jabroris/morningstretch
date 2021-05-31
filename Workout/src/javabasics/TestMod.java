package javabasics;

public class TestMod {

	public static void main(String[] args) {
		
		int deg = 0;
		
		System.out.println((deg+90)%360);
		
		System.out.println((deg+270)%360);
		
		deg = 180;
		
		System.out.println((deg+5*90)%360);
	}
}
