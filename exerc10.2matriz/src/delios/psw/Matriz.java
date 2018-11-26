package delios.psw;

import java.util.Scanner;
public class Matriz {
			private int i;
			private int j;
			private int lin = 3;
			private int col = 3;
			int valor[][] = new int[lin][col];
			
			Scanner sc = new Scanner(System.in);
			
			public void leitura_dados_matriz() {
				System.out.println("Entre com a matriz de ordem 3x3");
				for(i=0; i<lin; i++) {
					for(j=0; j<col; j++) {
						valor[i][j] = sc.nextInt();
					}
				}
			}
			
			public void mostrarMatriz() {
				System.out.println("Matriz:");
				for(i=0; i<lin; i++) {
					System.out.printf("\n");
					for(j=0; j<col; j++) {
						System.out.printf("%d ", valor[i][j]);
					}
				}
			}

			public int getLin() {
				return lin;
			}

			public void setLin(int lin) {
				this.lin = lin;
			}

			public int getCol() {
				return col;
			}

			public void setCol(int col) {
				this.col = col;
			}
		}
	
