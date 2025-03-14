package com.hakancivelek.singleton;

public class SingletonClient {

	public static void main(String[] args) {
		for (int i = 0; i<10; i++){
			Singleton s = Singleton.getInstance();
			s.printName();
		}
		
		Singleton s1 = Singleton.getInstance();
		System.out.println("\nHashcode: " + s1.hashCode());
		
		Singleton s2 = Singleton.getInstance();
		System.out.println("Hashcode: " + s2.hashCode());
		
		if(s1 == s2)
			System.out.println("\nThe same object!");
		else
			System.out.println("Different objects!");
	}
}
