package delios.psw.ponto2D;

public class Principal_ponto2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cria_arq f = new Cria_arq();
		Leituraponto2D l = new Leituraponto2D();
		
		
		f.openFile();
		f.adcionaRegistros();
		f.closeFile();
		
		l.openFile();
		l.lerArquivo();
		l.closeFile();

	}


}


