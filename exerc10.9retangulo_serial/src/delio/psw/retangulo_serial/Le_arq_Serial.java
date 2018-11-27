package delio.psw.retangulo_serial;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.util.Scanner;



	public class Le_arq_Serial {
		Scanner scanner;
		private ObjectInputStream in;

		public void openFile() {
			try {
				
				in = new ObjectInputStream(new FileInputStream("c:\\Users\\adeli\\Desktop\\texto\\retangulo_serial.txt"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.exit(0);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void closeFile() {
			if (scanner != null) {
				scanner.close();
				scanner = null;
			}
		}

		public void lerArquivo() {
			Ponto2D ponto = new Ponto2D();

			System.out.printf("Registros de Ponto2D:\n\n");

			try {
				ponto = (Ponto2D) in.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(ponto);
		}
	}


