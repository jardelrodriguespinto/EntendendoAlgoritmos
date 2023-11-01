package br.com.entendoAlgoritmos;

public class BuscaBinaria {
	public static void main(String[] args) {
		
		int[] arr = new int[] {1, 3, 5, 7, 9 };
		
		System.out.println(buscaBinaria(arr, 546));
	}
	
	private static int buscaBinaria(int[] elements, int item) {
		try {
			
			int baixo = 0;
			int alto = elements[elements.length - 1];
			int meio = 0;
			int chute = 0;
			
			while (baixo <= alto) {
				
				meio = (baixo + alto) / 2;
				chute = elements[meio];
				
				if (chute == item)
					return elements[meio];
				else if (chute > item )
					alto -= 1;
				else
					baixo += 1;
			}
			
			return -1;
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			return -1;
		}
	}
}