package delios.psw;

public class Principal_retangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cria_arq_retangulo a = new Cria_arq_retangulo();
		Ler_arq_retangulo l = new Ler_arq_retangulo();
		
		a.openFile();
		a.adcionaRegistros();
		a.closeFile();
		
		l.openFile();
		l.lerArquivo();
		l.closeFile();

	}


}
