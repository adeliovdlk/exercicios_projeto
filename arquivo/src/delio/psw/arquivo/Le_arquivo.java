package delio.psw.arquivo;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class Le_arquivo {
		Scanner scanner;
		
		public void openFile() {
				try {
					scanner = new Scanner( new File("C:\\Users\\adeli\\Desktop\\texto\\politico.txt"));
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
			Politico politico = new Politico();
			
			System.out.printf("Registros de politicos:\n\n");
			
			while (scanner.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
				politico.setNumero(scanner.nextInt());
				
				politico.setNome(scanner.next());
				politico.setPartido(scanner.next());
				
				System.out.println(politico);
			}
		}
	}
