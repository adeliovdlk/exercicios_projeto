package exercicio_7_2;

import java.util.Scanner;

public class Principal_Num_complexo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numero_complexo aux = new Numero_complexo();
		Scanner scanner = new Scanner (System.in);
		System.out.println("INSIRA O PRIMEIRO NUMERO COMPLEXO");
		
		System.out.println("INSIRA O VALOR DA PARTE REAL");
		double parteReal= scanner.nextDouble();
		System.out.printf("primeiraparte real %f",parteReal);
		System.out.println("INSIRA O VALOR DA PARTE IMAGINARIA");
		double parteImaginario = scanner.nextDouble();
		System.out.printf("primeiraparte real %f",parteImaginario);
		
		
		
	}

}
