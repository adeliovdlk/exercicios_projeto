package delios.psw.ponto2D;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class Leituraponto2D {
		Scanner scanner;
		
		public void openFile() {
				try {
					scanner = new Scanner( new File("C:\\Users\\adeli\\Desktop\\texto\\Ponto2D.txt") );
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					System.exit(0);
				}
		}
		
		public void closeFile() {
			if(scanner != null) {
				scanner.close();
				scanner = null;
			}
		}
		
		public void lerArquivo() {
			Ponto2D ponto = new Ponto2D();
			
			System.out.printf("Registro de Ponto2D:\n\n");
			
			while (scanner.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
				ponto.setX(scanner.nextDouble());
				ponto.setY(scanner.nextDouble());
				
				System.out.println(ponto);
			}
		}
	

}
