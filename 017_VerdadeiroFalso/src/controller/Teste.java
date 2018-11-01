package controller;

public class Teste {

	public static void main(String[] args) {
		boolean b = false;
		boolean a = true;
		boolean c = b || !b;
		if (c)
		{
			System.out.println(c);
		}
		
		if (a != b) {
			System.out.println("Iguais");

		} else {
			System.out.println("Diferentes");
		}

	}
}