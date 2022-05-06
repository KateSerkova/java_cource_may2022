package ru.se.sendbox;

public class MyFirstProgramm {

	public static void main(String[] args) {
		System.out.println("Hello, world1");


		hello("world");
		hello("Moscow");

	}

	public static void hello(String somebody) {
		//String somebody = "world";
		System.out.println("Hello, " + somebody);
	}
}