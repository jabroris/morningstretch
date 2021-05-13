package javabasics;

public class MyMain {
	
	MyClass mc = new MyClass();
	MyClass myC = new MyClass();
		
	int mcInt = mc.getMyInt();
	int number = myC.getMyInt();
	
	public static void main(String[] args) {
		
		MyMain md = new MyMain();
		System.out.println("md.mcInt === " + md.mcInt);
		md.changeThatInt();
		System.out.println("md.number === " + md.number);
		
		MyClass mc = new MyClass();
		mc.setMyInt(444);
		System.out.println("mc.getMyInt === " + mc.getMyInt());
		System.out.println("md.number === " + md.number);
	}

	public void changeThatInt() {
		
		myC.setMyInt(33333);
	}
}
