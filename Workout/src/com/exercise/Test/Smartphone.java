package com.exercise.Test;

public class Smartphone {
	public static void main(String args[]) {
		Gadgets gd = new Electric();
		gd.print();
	}
}


interface Gadgets {
	default void print() {
		System.out.println("gadgget");
	}


	static void powerBackup() {
		System.out.println("power");
	}
}

interface Apps {
	default void print() {
		System.out.println("apps");
	}
}

class Electric implements Gadgets, Apps {
	public void print() {
		Gadgets.super.print();
		Apps.super.print();
		Gadgets.powerBackup();
		System.out.println("Smartphone");
	}
}