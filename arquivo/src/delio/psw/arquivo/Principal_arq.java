package delio.psw.arquivo;


	public class Principal_arq {

		public static void main(String[] args) {
			
			Cria_arq_tex arq= new Cria_arq_tex();
			 
			arq.openfile();
			arq.adiciona_registros();
			arq.fecha_arquivo();

		}
	}

		
	

