package delio.psw.arquivo;


	public class Principal_le_serial {

		public static void main(String[] args) {
			Le_arquivo arq= new Le_arquivo();
			 
			arq.openFile();
			arq.lerArquivo();
			arq.closeFile();	
			}

	}



