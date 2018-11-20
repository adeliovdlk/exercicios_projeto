package delios.psw.restaurante;

import java.util.Scanner;

public class Principal_restaurante {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	Restaurante restaurante = new Restaurante(25);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("FAVOR INFORMAR O CUSTO DA BEBIDA");
			float f = sc.nextFloat();
			restaurante.custoBebida(f);
			
			System.out.println("FAVOR INFORMAR O CUSTO DO PRATO");
			f = sc.nextFloat();
			restaurante.custoPrato(f);
			
			restaurante.adicionaCliente(1);
			restaurante.adicionaCliente(1);
			restaurante.adicionaCliente(1);
			restaurante.adicionaBebida(1);
			restaurante.adicionaBebida(1);
			restaurante.adicionaBebida(1);
			restaurante.adicionaBebida(1);
			restaurante.adicionaBebida(1);
			
			System.out.printf("O VALOR DA MESA 1 E : %.2f", 
					restaurante.calculaConta(1));
			System.out.printf("O CUSTO PARA CADA CLIENTE DA MESA 1 E DE : %.2f", 
					restaurante.calculaContaPorCliente(1));
			
		}





		}
