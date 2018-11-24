package delio.psw.arquivo;

public class Principal_le_arq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Le_arquivo arq= new Le_arquivo();
		 
		arq.openFile();
		arq.lerArquivo();
		arq.closeFile();

	}

}
