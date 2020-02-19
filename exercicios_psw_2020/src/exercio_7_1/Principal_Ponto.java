package exercio_7_1;


public class Principal_Ponto {
	public static void main( String[] args){
		Ponto p1 = new Ponto(1,2);
		Ponto p2 = new Ponto (1,1);
		//Ponto   p3 = new Ponto(1, 2);
		
		System.out.printf("O PONTO 1 TEM CORDENADAA X %f , Y %f ",p1.getX(), p1.getY());
		System.out.println();
		System.out.printf("O PONTO 1 TEM CORDENADAA X %f , Y %f ",p2.getX(), p2.getY());
		System.out.println();
		System.out.printf("a distancia entre o ponto 1 de o ponto 2 e: %f ",p2.distancia(p2));
		
	}

}
