package delio.psw.retangulo_serial;

public class Principal_retangulo_serial {

	public static void main(String[] args) {
		Cria_arq_serial criarArq = new Cria_arq_serial();
		Le_arq_Serial lerArq = new Le_arq_Serial();
		
		criarArq.open();
		criarArq.adicionaRegistro();
		criarArq.closeFile();
		
		lerArq.openFile();
		lerArq.lerArquivo();
		lerArq.closeFile();

	}

}
