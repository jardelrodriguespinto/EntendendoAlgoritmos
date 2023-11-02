package br.com.entendoAlgoritmos;

import java.util.Arrays;

public class Recursao {
	public static void main(String[] args) {
		
		System.out.println(soma(30));
	}
	
	private static int calculeFatorial(int num) {
		
		if ( num <= 1 )
			return 1;
		
		return num * calculeFatorial(num - 1);
	}
	
	private static String contagemRegressiva(int num) {
		
		if (num == 1)
			return "1";
		
		return num + " " + contagemRegressiva(num - 1);
			
	}
	
	private static int calculandoSomaDosDigitos(int num) {
		
		return Arrays.stream(String.valueOf(num).split(""))
			         .mapToInt(e -> Integer.parseInt(e)).reduce(0, (acc, res) -> acc + res);
		
	}
	
	private static int soma(int num) {
		
		if ( num <= 1)
			return 1;
		
		return num + soma(num - 1);
		
	}
}