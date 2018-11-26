package delios.psw;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Cria_Matriz extends Matriz {
	private FileWriter objEscrita;
	
	public void openFile() {
		try {
			objEscrita = new FileWriter("C:\\Users\\adeli\\Desktop\\texto\\texto1.txt");
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}	
	}
	
	public void adcionaRegistros() {
		Matriz mat = new Matriz();
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Para terminar, digite <ctrl> d no UNIX/Linux/Mac OS X\n" + 
						"ou <ctrl> Z no Windows.\n\n");
		
		
		while(sc.hasNext()) {// enquanto nao for pressionada a tecla de saida do windows ou do linux
			mat.setCol(sc.nextInt());
			mat.setLin(sc.nextInt());
			
			//mat.leitura_dados_matriz();
			
			if(mat.valor[0][0] > -1){
				try {
					for(int i=0; i<3; i++) {
						for(int j=0; j<3; j++) {
							//System.out.printf("leitura");
							objEscrita.append(					//Adiciona ao arquivo
								String.format("%d ", mat.valor[i][j]));
							
						}
					}
				} catch (IOException e) {
					e.printStackTrace();			
					System.exit(0);
				}
			} else {
				System.out.println("O numero deve ser maior que 0.");
			
		}
			
	}
	}
	public void fecha_arquivo() {
		if(objEscrita !=null) {
			try {
			objEscrita.close();
			objEscrita=null;
		}
		catch(IOException e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
	
		}
	}
}