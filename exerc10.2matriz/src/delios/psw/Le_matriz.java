package delios.psw;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;
	public class Le_matriz {
		Scanner scanner;
		
		public void openFile() {
				try {
					scanner = new Scanner( new File("C:\\Users\\adeli\\Desktop\\texto\\matriz.txt"));
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
			Matriz mat = new Matriz();
			
			System.out.printf("\n\tDADOS DA MATRIZ :\n\n");
			
			while (scanner.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
				for(int i=0; i<mat.getLin(); i++) {
						for(int j=0; j<mat.getCol(); j++) {
							mat.valor[i][j] = scanner.nextInt();
						}
					}
					for(int i=0; i<mat.getLin(); i++) {
						System.out.println("\n");
						for(int j=0; j<mat.getCol(); j++) {
							System.out.printf("\t%d ", mat.valor[i][j]);
						}
					}
			}
		}
				
				
				
				
	}


