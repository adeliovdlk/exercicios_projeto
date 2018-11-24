package delio.psw.arquivo;

	public class Principal_serial {

		public static void main(String[] args) {
	 ArquivoSerial arq= new ArquivoSerial ();
			 
			arq.openfile();
			arq.adiciona_registros();
			arq.fecha_arquivo();

		}

	}


