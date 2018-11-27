package delios.psw;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//import delio.psw.arquivo;


public class Cria_arq_retangulo{// extends Retangulo  {
	private FileWriter objEscrita;
	

		public void openFile() {
			try {
				objEscrita = new FileWriter("C:\\Users\\adeli\\Desktop\\texto\\retangulo.txt");
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}	
		}
		
		public void adcionaRegistros() {
			Retangulo retangulo = new Retangulo();
			Scanner sc = new Scanner(System.in);
			
			System.out.printf("Para terminar, digite <ctrl> d no UNIX/Linux/Mac OS X\n" + 
							"ou <ctrl> Z no Windows.\n\n");
			
			System.out.println("Informe o comprimento e altura do Retangulo:\n");
			
			while(sc.hasNext()) {							//Laço é encerrado ao ler EOF (fim do arquivo)
				retangulo.setComprimento(sc.nextFloat());
				retangulo.setAltura(sc.nextFloat());
				
				if(retangulo.getComprimento() > 0 && retangulo.getAltura() > 0 ){
					try {
						objEscrita.append(				//Adiciona ao arquivo
								String.format("%.2f %.2f\n", retangulo.getComprimento(), retangulo.getAltura()));
					} catch (IOException e) {
						e.printStackTrace();			//sequencia de chamadas até onde encontrou o erro (primeiro passo para debugar)
						System.exit(0);
					}
				} else {
					System.out.println("O numero deve ser maior que 0.");
				}
			}
		}
		public void closeFile() {
			if(objEscrita != null) {
				try {
					objEscrita.close();
					objEscrita = null;
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(0);
				}
			}
		}
}
