package delio.psw.arquivo;


	import java.io.File;
	import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.Scanner;
	 
	public class Le_serial {
	Scanner scanner;
	private ObjectInputStream in;
	
	public void openFile() {
			try {
				scanner = new Scanner( new File("C:\\Users\\adeli\\Desktop\\CC 2018\\projeto de "
						+ "software 1\\politicos.txt"));
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
		
		System.out.println("Registros de politicos:\n\n");
		
		//System.in.writeObject(politico) // Laço é encerrado ao ler EOF (fim do arquivo)
			
		}
	
}








