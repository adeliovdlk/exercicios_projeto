package delio.psw.arquivo;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;

	public class Cria_arq_tex {
		private FileWriter objEscrita;
		
		public void openfile() { 
			try {
				objEscrita=new FileWriter("C:\\Users\\adeli\\Desktop\\texto\\politico.txt");
			}
				catch (IOException e) {
					e.printStackTrace();
					System.exit(0);
				System.exit(0);
			}
		}

		
		public void adiciona_registros() {
			Politico politico= new Politico();
			Scanner sc=new Scanner(System.in);
			
			System.out.printf(
					"para terminar, digite <ctrl> x de no unix/linux/mac os x"+
					"ou <crtl> z no windows");
			System.out.println("informe os dados do politico (numero, nome, eo partido");
			while(sc.hasNext()) {// enquanto nao for pressionada a tecla de saida do windows ou do linux
				politico.setNumero(sc.nextInt());
				politico.setNome(sc.next());
				politico.setPartido(sc.next());
				
			if (politico.getNumero()>0) {
				try {
					objEscrita.append(
							String.format("%5d  %5s  %s",
									politico.getNumero(),
									politico.getNome(),
									politico.getPartido())
								);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
